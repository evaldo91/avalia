package com.evaldo91.avalia.domain.nota;

import java.time.LocalDateTime;

public record EntradaDeNota(
        Long id,
        Long idProfessor,
        double notaConteudo,
        double notaProfessor,
        String feedback,
        LocalDateTime data
) {
}
