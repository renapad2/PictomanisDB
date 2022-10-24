package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
    @Column(name = "rolName",length = 45,nullable = false)
    private String rolName;

    public Rol(){

    }

    public Rol(int idRol,String rolName){
        this.idRol = idRol;
        this.rolName = rolName;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNameRol() {
        return rolName;
    }

    public void setNameRol(String rolName) {
        this.rolName = rolName;
    }
}
