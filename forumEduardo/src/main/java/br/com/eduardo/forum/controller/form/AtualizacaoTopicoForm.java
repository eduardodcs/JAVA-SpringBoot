package br.com.eduardo.forum.controller.form;

import javax.validation.constraints.NotEmpty;

import br.com.eduardo.forum.modelo.Topico;
import br.com.eduardo.forum.repository.TopicoRepository;

public class AtualizacaoTopicoForm {
	@NotEmpty
	private String titulo;
	@NotEmpty
	private String mensagem;
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
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getById(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		
		return topico;
	}
	
	
}
