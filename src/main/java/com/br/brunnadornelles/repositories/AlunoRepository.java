package com.br.brunnadornelles.repositories;

import com.br.brunnadornelles.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}