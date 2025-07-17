package com.leonart.gerenciamentousuario.application.domain.usuario;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class Usuario {

    private Long id;
    private String login;
    private String email;
    private String senha;
    private String nome;
    private LocalDateTime dataDaUltimaAlteracao;
    private LocalDateTime dataDeCriacao;
    private String endereco;


    private Usuario(final Long id, final String login, final String email, final String senha, final String nome,
                    final LocalDateTime dataDaUltimaAlteracao, final LocalDateTime dataDeCriacao,
                    final String endereco) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dataDaUltimaAlteracao = dataDaUltimaAlteracao;
        this.dataDeCriacao = dataDeCriacao;
        this.endereco = endereco;

    }
}
