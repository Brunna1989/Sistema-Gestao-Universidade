package com.br.brunnadornelles.service;

import com.br.brunnadornelles.entities.Professor;
import com.br.brunnadornelles.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> listarProfessores() {
        return professorRepository.findAll();
    }

    public Professor cadastrarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }
}