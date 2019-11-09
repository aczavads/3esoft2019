package br.unicesumar.cor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;
import br.unicesumar.base.BusinessException;

@RestController
@RequestMapping("/api/cores")
public class CorController extends BaseController<Cor, CorRepository>{
	
	
	@Override
	public void beforePost(Cor object) {
		if (object.getNome().contains("777")) {
			throw new BusinessException("777");
		}
	}

}
