package aula20190628.mapas;

import java.util.List;
import java.util.Map;

public interface ImovelRepository {
	
	void salvar(Imovel i);
	List<Imovel> recuperarTodos();
	Map<Pessoa, List<Imovel>> recuperarImoveisPorProprietario();


}
