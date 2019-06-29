package aula20190628.mapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImovelRepositoryMemory implements ImovelRepository {
	private final Set<Imovel> dados = new HashSet<>();

	@Override
	public void salvar(Imovel i) {
		this.dados.add(i);
	}

	@Override
	public List<Imovel> recuperarTodos() {
		return Collections.unmodifiableList(new ArrayList<>(this.dados));
	}

	@Override
	public Map<Pessoa, List<Imovel>> recuperarImoveisPorProprietario() {
		Map<Pessoa, List<Imovel>> mapa = new HashMap<>();
		
		for (Imovel imovel : dados) {
			if (mapa.containsKey(imovel.getProprietario())) {
				List<Imovel> listaAtualDoProprietario = mapa.get(imovel.getProprietario());
				listaAtualDoProprietario.add(imovel);
			} else {
				List<Imovel> lista = new ArrayList<>();
				lista.add(imovel);
				mapa.put(imovel.getProprietario(), lista);
			}
		}
		
		return mapa;
	}

}
