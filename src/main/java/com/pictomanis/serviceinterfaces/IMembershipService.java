package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Membership;

import java.util.List;

public interface IMembershipService{
    public void insert(Membership membership);
    List<Membership> list();
}
