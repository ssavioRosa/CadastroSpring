package com.springdemo.cadastro.repository;

import com.springdemo.cadastro.endities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Repositorio de metodos SQL
@Repository
public interface Repositorio extends CrudRepository<Usuario, Integer> {




}
