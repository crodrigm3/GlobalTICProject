package com.example.ProyectoCooperativa.service;

import com.example.ProyectoCooperativa.entidades.Cliente;
import org.apache.catalina.User;

import java.util.List;
import java.util.Map;

public interface ServicioCliente {
    public List<Cliente>listarCliente();
    public Cliente guardarCliente(Cliente cliente);
    public Cliente consultarClientePorId(String documento);
    public Cliente actualizarCliente(Cliente cliente);
    public void eliminarClienteId(String documento);

    public Cliente actualizarPorId(String doc, Map<Object, Object>objectMap);
}