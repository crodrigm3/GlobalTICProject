package com.example.ProyectoCooperativa.service;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.repository.RepositorioCliente;
import org.apache.catalina.User;
import org.aspectj.apache.bcel.generic.InstructionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpCliente implements ServicioCliente {

    @Autowired
    private RepositorioCliente repositorioCliente;

    @Override
    public List<Cliente> listarCliente() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Cliente consultarClientePorId(String documento) {
        return repositorioCliente.findById(documento).get();
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public void eliminarClienteId(String documento) {
        repositorioCliente.deleteById(documento);

    }

    @Override
    public Cliente actualizarPorId(String doc, Map<Object, Object> objectMap) {
        Cliente cli = repositorioCliente.findById(doc).get();
        objectMap.forEach((key, value)->{
            Field field = ReflectionUtils.findField(Cliente.class, (String)key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, cli, value);
        });
        return repositorioCliente.save(cli);
    }

}