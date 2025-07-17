package com.leonart.gerenciamentousuario.infrastructure.out.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIO")
public class UsuarioJPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, length = 36)
    private Long id;

    @Column(name = "login", nullable = false, length = 50)
    private String login;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "senha", nullable = false, length = 16)
    private String senha;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "dataDaUltimaAlteracao", nullable = false, length = 20)
    private String dataDaUltimaAlteracao;

    @Column(name = "dataDeCriacao", nullable = false, length = 20)
    private String dataDeCriacao;

    @Column(name = "endereco", nullable = false, length = 100)
    private String endereco;


}
