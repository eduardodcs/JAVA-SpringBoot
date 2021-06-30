package br.com.eduardo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);
	
}
