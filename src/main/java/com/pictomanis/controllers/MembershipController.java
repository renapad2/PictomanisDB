package com.pictomanis.controllers;

import com.pictomanis.entities.Membership;
import com.pictomanis.serviceinterfaces.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    @Autowired
    private IMembershipService mService;
    @PostMapping
    public void registrar(@RequestBody Membership m) {mService.insert(m);}
    @GetMapping
    public List<Membership> list() {return mService.list();}
}
