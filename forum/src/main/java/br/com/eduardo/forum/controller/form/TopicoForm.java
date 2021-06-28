package br.com.eduardo.forum.controller.form;

import javax.validation.constraints.NotEmpty;

import br.com.eduardo.forum.modelo.Curso;
import br.com.eduardo.forum.modelo.Topico;
import br.com.eduardo.forum.repository.CursoRepository;

public class TopicoForm {
	@NotEmpty
	private String titulo;
	@NotEmpty
	private String mensagem;
	@NotEmpty
	private String nomeCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
}
