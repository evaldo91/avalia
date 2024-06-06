package com.evaldo91.avalia.domain.nota;


import com.evaldo91.avalia.domain.professor.Professor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "notas")
@Entity(name = "nota")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Nota {
    private Long id;
    private Professor professor;
    private double notaConteudo;
    private double notaProfessor;
    private LocalDateTime data;
}
