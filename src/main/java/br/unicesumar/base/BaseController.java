package br.unicesumar.base;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@RestController
public abstract class BaseController<ENTITY extends BaseEntity, REPOSITORY extends BaseRepository<ENTITY>> {
	@Autowired
	private REPOSITORY repo;
	
	
	public REPOSITORY getRepo() {
		return repo;
	}
	
	@GetMapping("/{id}")
	public ENTITY getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@GetMapping
	public List<ENTITY> get() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody ENTITY object) {
		repo.save(object);
		return object.getId();
	}
	
	@PutMapping("/{id}")
	private void put(@PathVariable String id, @RequestBody ENTITY object) {
		if (!Objects.equals(id, object.getId())) {
			throw new RuntimeException("Requisição inválida! Verifique os IDs da entidade!");
		}
		repo.save(object);
	}
	
	@DeleteMapping("/{id}")
	private void delete(@PathVariable String id) {
		repo.deleteById(id);
	}

}
