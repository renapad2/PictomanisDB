package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Resenas;
import com.pictomanis.repositories.IResenasRepository;
import com.pictomanis.serviceinterfaces.IResenasService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResenasServiceImpl implements IResenasService {
    @Autowired
    private IResenasRepository rR;
    @Override
    public void insert(Resenas resenas){rR.save(resenas);}

    @Override
    public List<Resenas> list(){return rR.findAll();}
}
