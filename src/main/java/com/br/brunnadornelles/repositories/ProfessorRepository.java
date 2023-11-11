package com.br.brunnadornelles.repositories;

import com.br.brunnadornelles.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}