package br.unicesumar.cor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;

@RestController
@RequestMapping("/api/cores")
public class CorController extends BaseController<Cor, CorRepository>{

}
