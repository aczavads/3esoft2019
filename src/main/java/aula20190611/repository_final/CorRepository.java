package aula20190611.repository_final;

import java.util.List;

public interface CorRepository {

	void inserir(Cor c) throws Exception; 
	List<Cor> obterTodas() throws Exception;
	void alterar(Cor c) throws Exception;
	void excluir(int id) throws Exception;

}