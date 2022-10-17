package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Pictograma;

import java.util.List;

public interface IPictogramaService {
    public void insert(Pictograma pictograma);
    List<Pictograma> list();
}
