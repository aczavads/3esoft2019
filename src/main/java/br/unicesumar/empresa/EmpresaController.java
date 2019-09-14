package br.unicesumar.empresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	@Autowired
	private EmpresaRepository repo;
		
	@GetMapping
	public List<Empresa> get() {
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Empresa get(@PathVariable String id) {
		return repo.findById(id).get();
	}
	@PostMapping
	public String post(@RequestBody Empresa novo) {
		repo.save(novo);
		return novo.getId();
	}
	@PutMapping("/{id}")
	public void get(@PathVariable String id, @RequestBody Empresa empresa) {
		if (!id.equals(empresa.getId())) {
			throw new RuntimeException("Ids devem ser iguais!");
		}
		repo.save(empresa);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
	
}
