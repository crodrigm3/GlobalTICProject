package com.example.ProyectoCooperativa.controller;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.User;
import com.example.ProyectoCooperativa.service.ServicioImpCliente;
import com.example.ProyectoCooperativa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ControladorCliente {
    @Autowired
    private ServicioImpCliente sic;

    UserService userService;

    public ControladorCliente(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("cliente")
    public String listar(Model modelo) {
        modelo.addAttribute("clientes", sic.listarCliente());
        return ("tableCliente");
    }

    @GetMapping("clienteU")
    public String listarU(Model modelo) {
        modelo.addAttribute("clientes", sic.listarCliente());
        return ("tableClienteU");
    }

    @GetMapping("cliente/nuevo")
    public String formularioRegistro(Model modelo) {
        modelo.addAttribute("clienteInsertar", new Cliente());
        return "frmclienteA";
    }

    @PostMapping("cliente/guardar")
    public String insertar(Cliente cli) {
        sic.guardarCliente(cli);
        return "redirect:/cliente";
    }

    @GetMapping("cliente/actualizar/{dato}")
    public String formularioActualizar(@PathVariable("dato") String dato, Model modelo) {
        Cliente cliente = sic.consultarClientePorId(dato);
        modelo.addAttribute("clienteActualizar", cliente);
        return "frmActualizar";
    }

    @PostMapping("cliente/actualizar")
    public String actualizar(Cliente cli) {
        sic.actualizarCliente(cli);
        return "redirect:/cliente";
    }

    @GetMapping("cliente/eliminar/{id}")
    public String eliminarporId(@PathVariable("id") String id) {
        sic.eliminarClienteId(id);
        return "redirect:/cliente";
    }


    @GetMapping("menu")
    public String listarMenu(Model modelo) {
        return ("menu");
    }

    @GetMapping("menuAdmin")
    public String listarMenuAdmin(Model modelo) {
        return ("menuAdmin");
    }

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal OidcUser principal) {
        if (principal !=null) {
            //System.out.println(principal.getClaims());
            User user=this.userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        }
            return "index";
        }
    }
