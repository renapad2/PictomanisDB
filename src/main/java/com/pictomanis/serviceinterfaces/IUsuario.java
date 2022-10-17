package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Usuario;

import java.util.List;

public interface IUsuario{
    public void insert(Usuario usuario);
    List<Usuario> list();
}
