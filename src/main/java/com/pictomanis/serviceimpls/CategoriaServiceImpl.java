package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Categoria;
import com.pictomanis.repositories.ICategoriaRepository;
import com.pictomanis.serviceinterfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaServiceImpl implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void insert(Categoria categoria) {cR.save(categoria);}

    @Override
    public List<Categoria> list(){return cR.findAll();}

}
