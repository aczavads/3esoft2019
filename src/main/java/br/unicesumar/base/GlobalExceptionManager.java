package br.unicesumar.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionManager {
	
	@ExceptionHandler({BusinessException.class})
	public ResponseEntity<String> tratar(BusinessException ex) {
		return ResponseEntity.badRequest().body(ex.getMessage());		
	}

	
}
