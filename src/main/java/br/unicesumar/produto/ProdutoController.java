package br.unicesumar.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repo;
	
	@GetMapping
	public List<Produto> getAll(@RequestParam("argumento") String argumento) {
		if (argumento == null || argumento.trim().length() == 0) {
			return repo.findAll();
		}
		return repo.findByNome(argumento);
	}
	
	@GetMapping("/maiorPreco")
	public Page<Produto> getMaiorPreco(Pageable p) {
		return repo.encontrarProdutosComMaiorPreco(p); 
	}
	
	@GetMapping("/menorPreco")
	public Page<Produto> getMenorPreco(Pageable p) {
		return repo.encontrarProdutosComMenorPreco(p);
	}
	
	
	@PostMapping
	public String post(@RequestBody Produto novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}

	
}
