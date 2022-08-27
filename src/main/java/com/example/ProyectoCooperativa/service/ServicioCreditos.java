package com.example.ProyectoCooperativa.service;

import com.example.ProyectoCooperativa.entidades.Creditos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServicioCreditos
{
    public List<Creditos> listaCreditos();
    public Creditos guardarCreditos (String documento, Creditos creditos);
}
