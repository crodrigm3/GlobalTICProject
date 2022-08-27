package com.example.ProyectoCooperativa.entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")

private String id;

@Column(name = "email")
    private String email;

@Column(name = "image")
    private String image;

@Column(name="auth0Id",unique = true)
    private String auth0Id;

    public User(String email, String image, String auth0Id) {
        this.email = email;
        this.image = image;
        this.auth0Id = auth0Id;

    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagen() {
        return image;
    }

    public void setImagen(String imagen) {
        this.image = imagen;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }
}

