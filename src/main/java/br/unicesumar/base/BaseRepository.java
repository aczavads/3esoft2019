package br.unicesumar.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseRepository<ENTITY> extends JpaRepository<ENTITY, String>{

}
