package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol rol);
    List<Rol> list();
}
