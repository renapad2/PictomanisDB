package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Idiomas;

import java.util.List;

public interface IIdiomasService {
    public void insert(Idiomas idiomas);
    List<Idiomas> list();
}
