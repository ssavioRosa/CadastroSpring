package com.springdemo.cadastro.controller;


import com.springdemo.cadastro.repository.Repositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.springdemo.cadastro.endities.Usuario;



@RestController
public class Controle {




    private final Repositorio acao;

    public Controle(Repositorio acao) {
        this.acao = acao;
    }


    //Cadastrar no banco
    @PostMapping("/api")
    public Usuario cadastrar(@RequestBody Usuario obj){
        return acao.save(obj);
    }

    @GetMapping("")
    public String mensagem(){
        return "Cadastro Usuario";
}


}
