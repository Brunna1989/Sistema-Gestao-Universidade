package com.br.brunnadornelles.controller;

import com.br.brunnadornelles.entities.Professor;
import com.br.brunnadornelles.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }

    @PostMapping
    public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor) {
        Professor novoProfessor = professorService.cadastrarProfessor(professor);
        return ResponseEntity.ok(novoProfessor);
    }
}