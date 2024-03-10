package com.springdemo.cadastro.endities;


import jakarta.persistence.*;

@Entity
@Table (name = "usuarios")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;
    @Column(name = "nome_usuario")
    private String nome_usuario;
    @Column(name = "email_usuario")
    private String email_usuario;
    @Column(name = "senha_usuario")
    private String senha_usuario;

}
