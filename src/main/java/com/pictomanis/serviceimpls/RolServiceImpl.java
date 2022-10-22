package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Rol;
import com.pictomanis.repositories.IRolRepository;
import com.pictomanis.serviceinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolServiceImpl implements IRolService {
    @Autowired
    private IRolRepository roR;
    @Override
    public void insert(Rol rol) {roR.save(rol);}

    @Override
    public List<Rol> list(){return roR.findAll();}

}
