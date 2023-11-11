package com.br.brunnadornelles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.br.brunnadornelles.entities.Aluno;
import com.br.brunnadornelles.repositories.AlunoRepository;
import com.br.brunnadornelles.service.AlunoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AlunoServiceTest {

    @Autowired
    private AlunoService alunoService;

    @MockBean
    private AlunoRepository alunoRepository;
    private Aluno aluno1;
    private List<Aluno> alunos;

    @BeforeEach
    public void setup() {

        aluno1 = new Aluno();
        alunos = new ArrayList<>();
        alunos.add(aluno1);
    }

    @Test
    public void testListarAlunos() {
        when(alunoService.listarAlunos()).thenReturn(alunos);
    }
    @Test
    public void testCadastrarAlunos() {
        when(alunoRepository.save(any(Aluno.class))).thenReturn(aluno1);
        Aluno result = alunoService.cadastrarAluno(aluno1);
        assertEquals(aluno1, result);
    }
}