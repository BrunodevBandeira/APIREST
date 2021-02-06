package com.javaapirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaapirest.apirest.models.Produto_A;

public interface ProdutoRepository_A extends JpaRepository<Produto_A, Long>{
	
	Produto_A findById(long id);
	
	
}
