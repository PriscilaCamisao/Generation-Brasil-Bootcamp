package org.generation.lojagames.lojagames.repository;

import java.util.List;

import org.generation.lojagames.lojagames.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
public List<ProdutoModel> findAllByDescricaoTituloContainingIgnoreCase(String descricaoTitulo);
}

