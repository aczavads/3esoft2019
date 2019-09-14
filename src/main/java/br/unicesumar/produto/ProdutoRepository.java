package br.unicesumar.produto;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
	
	@Query(value="select a.* from produto a where a.preco = (select max(b.preco) from produto b)", nativeQuery=true)
	Page<Produto> encontrarProdutosComMaiorPreco(Pageable p);

	@Query(value="select a.* from produto a where a.preco = (select min(b.preco) from produto b)", nativeQuery=true)
	Page<Produto> encontrarProdutosComMenorPreco(Pageable p); 

	@Query(value="select * from produto where nome = :nome", nativeQuery=true)
	List<Produto> findByNome(String nome);
}
