package aula20190607.repository;

import java.util.List;

public interface CorRepository {

	void inserir(Cor c);
	List<Cor> obterTodas();
	void alterar(Cor c);
	void excluir(int id);

}