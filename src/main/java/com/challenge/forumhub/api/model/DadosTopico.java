package com.challenge.forumhub.api.model;

import jakarta.validation.constraints.NotBlank;

public record DadosTopico(

        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotBlank
        String autor,

        @NotBlank
        String curso) {
}
