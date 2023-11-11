package com.br.brunnadornelles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.br.brunnadornelles.entities.Curso;
import com.br.brunnadornelles.repositories.CursoRepository;
import com.br.brunnadornelles.service.CursoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class CursoServiceTest {

    @Autowired
    private CursoService cursoService;

    @MockBean
    private CursoRepository cursoRepository;
    private Curso curso1;
    private List<Curso> cursos;

    @BeforeEach
    public void setup() {

        curso1 = new Curso();
        cursos = new ArrayList<>();
        cursos.add(curso1);
    }

    @Test
    public void testListarCursos() {
        when(cursoService.listarCursos()).thenReturn(cursos);
    }

    @Test
    public void testCadastrarCursos() {
        when(cursoRepository.save(any(Curso.class))).thenReturn(curso1);
        Curso result = cursoService.cadastrarCurso(curso1);
        assertEquals(curso1, result);
    }
}