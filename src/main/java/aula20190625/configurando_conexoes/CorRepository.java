package aula20190625.configurando_conexoes;

import java.util.List;

public interface CorRepository {

	void inserir(Cor c) throws Exception; 
	List<Cor> obterTodas() throws Exception;
	void alterar(Cor c) throws Exception;
	void excluir(int id) throws Exception;

}