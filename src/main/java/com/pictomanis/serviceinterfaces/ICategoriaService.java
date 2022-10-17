package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Categoria;

import java.util.List;

public interface ICategoriaService{
    void insert(Categoria categoria);
    List<Categoria> list();
}
