package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Membership;
import com.pictomanis.repositories.IMembershipRepository;
import com.pictomanis.serviceinterfaces.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MembershipServiceImpl implements IMembershipService {
    @Autowired
    private IMembershipRepository mR;
    @Override
    public void insert(Membership membership){mR.save(membership);}

    @Override
    public List<Membership> list(){return mR.findAll();}
}
