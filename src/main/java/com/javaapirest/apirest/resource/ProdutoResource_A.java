package com.javaapirest.apirest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaapirest.apirest.models.Produto_A;
import com.javaapirest.apirest.repository.ProdutoRepository_A;

@RestController
@RequestMapping(value = "/api")

public class ProdutoResource_A {
	
	@Autowired
	ProdutoRepository_A produtoRepository_A;

	@GetMapping("/produtos")
	public List<Produto_A> listaProdutos(){
		return produtoRepository_A.findAll();
	}
	
}
