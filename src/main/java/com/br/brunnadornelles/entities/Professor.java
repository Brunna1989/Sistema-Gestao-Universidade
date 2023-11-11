package com.br.brunnadornelles.entities;

import javax.validation.constraints.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne
    @NotNull
    private Disciplina disciplina;

    public Professor() {
    }

    public Professor(Long id, String nome, Disciplina disciplina) {
        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public
    Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}