package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Membership")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembership;
    @Column(name = "nameMiembro",length = 45,nullable = false)
    private String nameMiembro;
    @Column(name = "type",length = 35,nullable = false)
    private String type;

    public Membership(){

    }

    public Membership(int idMembership,String nameMiembro,String type){
        this.idMembership = idMembership;
        this.nameMiembro = nameMiembro;
        this.type = type;
    }

    public int getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(int idMembership) {
        this.idMembership = idMembership;
    }

    public String getNameMiembro() {
        return nameMiembro;
    }

    public void setNameMiembro(String nameMiembro) {
        this.nameMiembro = nameMiembro;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
