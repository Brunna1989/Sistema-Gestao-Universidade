package com.br.brunnadornelles.controller;

import com.br.brunnadornelles.entities.Disciplina;
import com.br.brunnadornelles.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> listarDisciplinas() {
        return disciplinaService.listarDisciplinas();
    }

    @PostMapping
    public ResponseEntity<Disciplina> cadastrarDiciplina(@RequestBody Disciplina disciplina) {
        Disciplina novaDisciplina = disciplinaService.cadastrarDisciplina(disciplina);
        return ResponseEntity.ok(novaDisciplina);
    }
}