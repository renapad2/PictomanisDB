package com.pictomanis.controllers;

import com.pictomanis.entities.Membership;
import com.pictomanis.entities.Pictograma;
import com.pictomanis.serviceinterfaces.IPictogramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pictograma")
public class PictogramaController {
    @Autowired
    private IPictogramaService pService;
    @PostMapping
    public void registrar(@RequestBody Pictograma p) {pService.insert(p);}
    @GetMapping
    public List<Pictograma> list() {return pService.list();}
}
