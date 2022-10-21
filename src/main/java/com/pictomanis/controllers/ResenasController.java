package com.pictomanis.controllers;

import com.pictomanis.entities.Resenas;
import com.pictomanis.serviceinterfaces.IResenasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resenas")
public class ResenasController {
    @Autowired
    private IResenasService rService;
    @PostMapping
    public void registrar (@RequestBody Resenas r) {rService.insert(r);}
    @GetMapping
    public List<Resenas> list() {return rService.list();}
}
