package br.unicesumar.disciplina;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController extends BaseController<Disciplina, DisciplinaRepository>{

	
	@DeleteMapping("/{id}/ministrantes/{idProfessor}")
	public void deleteMinistrante(@PathVariable("id") String id, @PathVariable("idProfessor") String idProfessor) {
		Disciplina d = getRepo().findById(id).get();
		d.removerMinistrantePeloId(idProfessor);
		getRepo().save(d);
	}
	
	
}
 





