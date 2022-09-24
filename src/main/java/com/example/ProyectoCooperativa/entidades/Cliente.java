package com.example.ProyectoCooperativa.entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Clientes")
public class Cliente {
    @Id
    private String documento;
    @Column(nullable=false, length =30)
    private String nombre;
    @Column(nullable=false, length =30)
    private String apellidos;
    @Column(nullable=false, length =25,unique = true)
    private String correo;
    @Column(nullable=false, length =15)
    private String celular;
    /*  Relacion */
    /*@ManyToOne
    @JoinColumn(name="codigo_linea")
    LineasDeCredito lc;*/

    public Cliente(String documento, String nombre, String apellidos, String correo, String celular) {
        this.documento = documento;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
