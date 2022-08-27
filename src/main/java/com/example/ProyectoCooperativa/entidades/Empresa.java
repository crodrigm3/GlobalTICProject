package com.example.ProyectoCooperativa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")
public class Empresa {
    @Id
    private String nit;
    @Column(nullable=false, length =30)
    private String nombre;
    @Column(nullable=false, length =30)
    private String direccion;
    @Column(nullable=false, length =25,unique = true)
    private String correo;
    @Column(nullable=false, length =15)
    private String celular;
    /*  Relacion */
    /*@ManyToOne
    @JoinColumn(name="codigo_linea")
    LineasDeCredito lc;*/

    public Empresa(String nit, String nombre, String direccion, String correo, String celular) {
        this.nit = nit;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.nombre = nombre;
    }

    public Empresa() {
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
