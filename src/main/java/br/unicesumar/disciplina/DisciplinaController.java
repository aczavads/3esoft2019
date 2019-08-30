package br.unicesumar.disciplina;

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

import br.unicesumar.professor.Professor;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController {
	@Autowired
	private DisciplinaRepository repo;

	//curl -X GET http://localhost:9090/api/disciplinas
	@GetMapping
	public List<Disciplina> getAll() {
		return repo.findAll();
	}
	//curl -v -H "Content-Type: application/json" -X POST http://localhost:9090/api/disciplinas -d "{\"nome\": \"teste\"}"
	@PostMapping
	public String post(@RequestBody Disciplina nova) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for (Professor p : nova.getMinistrantes()) {
			System.out.println(p.getId());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		repo.save(nova);
		return nova.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

	@GetMapping("/{id}")
	public Disciplina getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	//curl -v -H "Content-Type: application/json" -X PUT http://localhost:9090/api/disciplinas/7c31bc81-bcae-4b63-8d28-3d07e2fa31f9 -d "{\"id\":\"7c31bc81-bcae-4b63-8d28-3d07e2fa31f9\", \"nome\": \"teste ahhhhhhh!\"}"
	@PutMapping("/{id}")
	public void put(@PathVariable("id") String id, @RequestBody Disciplina disciplina) {
		if (!id.equals(disciplina.getId())) {
			throw new RuntimeException("Id da disciplina está incorreto!");
		}
		repo.save(disciplina);
	}
	
	@DeleteMapping("/{id}/ministrantes/{idProfessor}")
	public void deleteMinistrante(@PathVariable("id") String id, @PathVariable("idProfessor") String idProfessor) {
		Disciplina d = repo.findById(id).get();
		Professor paraRemover = null;
		for (Professor ministrante : d.getMinistrantes()) {
			if (ministrante.getId().equals(idProfessor)) {
				paraRemover = ministrante;
			}
		}
		d.getMinistrantes().remove(paraRemover);
		repo.save(d);
	}
	
}
 





