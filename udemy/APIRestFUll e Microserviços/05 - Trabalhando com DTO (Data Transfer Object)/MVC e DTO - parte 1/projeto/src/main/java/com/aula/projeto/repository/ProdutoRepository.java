package com.aula.projeto.repository;

import com.aula.projeto.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer>{


}
