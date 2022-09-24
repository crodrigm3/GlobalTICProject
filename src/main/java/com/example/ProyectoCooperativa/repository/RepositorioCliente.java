package com.example.ProyectoCooperativa.repository;

import com.example.ProyectoCooperativa.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Cliente,String> {

}
