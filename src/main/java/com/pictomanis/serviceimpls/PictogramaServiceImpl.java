package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Pictograma;
import com.pictomanis.repositories.IPictogramaRepository;
import com.pictomanis.serviceinterfaces.IPictogramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictogramaServiceImpl implements IPictogramaService {
    @Autowired
    private IPictogramaRepository pR;
    @Override
    public void insert(Pictograma pictograma){
        pR.save(pictograma);
    }

    @Override
    public List<Pictograma> list(){return pR.findAll();}
}
