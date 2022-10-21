package com.pictomanis.controllers;

import com.pictomanis.entities.Rol;
import com.pictomanis.serviceinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService roService;
    @PostMapping
    public void registrar(@RequestBody Rol ro) {roService.insert(ro);}
    @GetMapping
    public List<Rol> list() {return roService.list();}
}
