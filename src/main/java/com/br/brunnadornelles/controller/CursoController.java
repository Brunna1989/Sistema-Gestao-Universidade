package com.br.brunnadornelles.controller;

import com.br.brunnadornelles.entities.Curso;
import com.br.brunnadornelles.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public ResponseEntity<Curso> cadastrarAluno(@RequestBody Curso curso) {
        Curso novoCurso = cursoService.cadastrarCurso(curso);
        return ResponseEntity.ok(novoCurso);
    }
}