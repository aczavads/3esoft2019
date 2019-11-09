package br.unicesumar.pessoa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;
import br.unicesumar.base.BusinessException;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController extends BaseController<Pessoa, PessoaRepository>{
	
	@Override
	public void afterPost(Pessoa object) {
		if (object.getId().contains("b")) {
			throw new BusinessException("Letra 'b' não permitida no id!");
		}
	}
	
	@PostMapping("/fisicas")
	public String post(@RequestBody Fisica nova) {
		return super.post(nova);
	}
	
	@PostMapping("/juridicas")
	public String post(@RequestBody Juridica nova) {
		return super.post(nova);
	}

	@PutMapping("/fisicas/{id}")
	public ResponseEntity<String> put(@PathVariable("id") String id, @RequestBody Fisica pessoa) {
		return super.put(id, pessoa);
	}
	
	@PutMapping("/juridicas/{id}")
	public ResponseEntity<String> put(@PathVariable("id") String id, @RequestBody Juridica pessoa) {
		return super.put(id, pessoa);
	}
	
	
	

}
