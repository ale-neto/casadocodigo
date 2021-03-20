package org.casadocodigo.loja.beans;

import java.util.ArrayList;
import java.util.List;

import org.casadocodigo.loja.daos.LivroDao;
import org.casadocodigo.loja.models.Livro;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class AdminListaLivrosBean {

	@Inject
	LivroDao livroDao;

	private List<Livro> livros = new ArrayList<>();

	public List<Livro> getLivros() {
		this.livros = livroDao.listar();
		return livros;
	}

}
