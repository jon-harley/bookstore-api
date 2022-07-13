package com.jonathan.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.bookstore.domain.Livro;
import com.jonathan.bookstore.repositories.LivroRepository;
import com.jonathan.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	@Autowired
	private CategoriaService categoriaService;

	public Livro findById(Integer Id) {
		Optional<Livro> obj = repository.findById(Id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + Id + ", Tipo: " + Livro.class.getName()));
	}

	public List<Livro> findAllByCategory(Integer id_cat) {
		categoriaService.findById(id_cat);
		return repository.findAllByCategoria(id_cat);
	}

	// Não irá ter componente para retornar todos os livros\\
	public List<Livro> findAll() {
		return repository.findAll();
	}
}
