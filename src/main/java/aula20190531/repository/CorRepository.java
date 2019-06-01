package aula20190531.repository;

import java.util.List;

public interface CorRepository {

	void inserir(Cor verde);
	List<Cor> obterTodas();
	void alterar(Cor verde);
	void excluir(int id);

}
