package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Idiomas;
import com.pictomanis.repositories.IIdiomasRepository;
import com.pictomanis.serviceinterfaces.IIdiomasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IdiomasServiceImpl implements IIdiomasService {
    @Autowired
    private IIdiomasRepository iR;
    @Override
    public void insert(Idiomas idiomas) {iR.save(idiomas);}

    @Override
    public List<Idiomas> list(){return iR.findAll();}
}
