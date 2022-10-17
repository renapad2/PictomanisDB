package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Resenas;

import java.util.List;

public interface IResenasService {
    public void insert(Resenas resenas);
    List<Resenas> list();
}
