package com.jonathan.bookstore.dtos;

import java.io.Serializable;

import com.jonathan.bookstore.domain.Categoria;

import lombok.Data;

@Data
public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String descricao;

	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}

}
