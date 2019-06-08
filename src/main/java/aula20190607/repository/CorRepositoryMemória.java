package aula20190607.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CorRepositoryMemória implements CorRepository {
	private Set<Cor> cores = new HashSet<>();

	public void inserir(Cor c) {
		this.cores.add(c);
	}
	
	public List<Cor> obterTodas() {
		//return null;
		//return new ArrayList<>();
		return Collections.unmodifiableList(new ArrayList<>(cores));
	}
	
	public void alterar(Cor c) {
		this.excluir(c.getId());
		this.inserir(c);
	}
	
	public void excluir(int id) {
		/*
		this.cores = cores
				.stream()
				.filter( c -> c.getId() != id )
				.collect(Collectors.toSet());
	    */
		
		Cor aRemover = null;
		for (Cor c : this.cores) {
			if (c.getId() == id) {
				aRemover = c;
				break;
			}
		}
		if (aRemover != null) {
			this.cores.remove(aRemover);
		}
	}	
}
 