package com.pictomanis.controllers;

import com.pictomanis.entities.Usuario;
import com.pictomanis.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uService;
    @PostMapping
    public void registrar(@RequestBody Usuario u) {uService.insert(u);}
    @GetMapping
    public List<Usuario> list() {return uService.list();}
}
