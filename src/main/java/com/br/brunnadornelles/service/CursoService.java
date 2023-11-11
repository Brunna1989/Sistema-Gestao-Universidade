package com.br.brunnadornelles.service;

import com.br.brunnadornelles.entities.Curso;
import com.br.brunnadornelles.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso cadastrarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
}