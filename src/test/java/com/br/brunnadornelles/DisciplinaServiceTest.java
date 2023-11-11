package com.br.brunnadornelles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.br.brunnadornelles.entities.Disciplina;
import com.br.brunnadornelles.repositories.DisciplinaRepository;
import com.br.brunnadornelles.service.DisciplinaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class DisciplinaServiceTest {

    @Autowired
    private DisciplinaService disciplinaService;

    @MockBean
    private DisciplinaRepository disciplinaRepository;
    private Disciplina disciplina1;
    private List<Disciplina> disciplinas;

    @BeforeEach
    public void setup() {

        disciplina1 = new Disciplina();
        disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
    }

    @Test
    public void testListarDisciplinas() {
        when(disciplinaService.listarDisciplinas()).thenReturn(disciplinas);
    }

    @Test
    public void testCadastrarDisciplinas() {
        when(disciplinaRepository.save(any(Disciplina.class))).thenReturn(disciplina1);
        Disciplina result = disciplinaService.cadastrarDisciplina(disciplina1);
        assertEquals(disciplina1, result);
    }
}