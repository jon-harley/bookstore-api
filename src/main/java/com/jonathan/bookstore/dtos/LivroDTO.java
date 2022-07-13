package com.jonathan.bookstore.dtos;

import java.io.Serializable;

import com.jonathan.bookstore.domain.Livro;

import lombok.Data;

@Data
public class LivroDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String titulo;

	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
	}

	public LivroDTO() {
		super();
	}

}
