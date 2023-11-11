package com.br.brunnadornelles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.br.brunnadornelles.entities.Professor;
import com.br.brunnadornelles.repositories.ProfessorRepository;
import com.br.brunnadornelles.service.ProfessorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProfessorServiceTest {

    @Autowired
    private ProfessorService professorService;

    @MockBean
    private ProfessorRepository professorRepository;
    private Professor professor1;
    private List<Professor> professores;

    @BeforeEach
    public void setup() {

        professor1 = new Professor();
        professores = new ArrayList<>();
        professores.add(professor1);
    }

    @Test
    public void testListarProfessores() {
        when(professorService.listarProfessores()).thenReturn(professores);
    }

    @Test
    public void testCadastrarProfessores() {
        when(professorRepository.save(any(Professor.class))).thenReturn(professor1);
        Professor result = professorService.cadastrarProfessor(professor1);
        assertEquals(professor1, result);
    }
}