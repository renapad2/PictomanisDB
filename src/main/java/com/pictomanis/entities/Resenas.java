package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Resenas")
public class Resenas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResenas;
    @Column(name = "nameResenas",length = 45,nullable = false)
    private String nameResenas;
    @Column(name = "descripcionResenas",length = 255,nullable = false)
    private String descripcionResenas;

    public Resenas(){

    }

    public Resenas(int idResenas,String nameResenas,String descripcionResenas){
        this.idResenas = idResenas;
        this.nameResenas = nameResenas;
        this.descripcionResenas = descripcionResenas;
    }

    public int getIdResenas() {
        return idResenas;
    }

    public void setIdResenas(int idResenas) {
        this.idResenas = idResenas;
    }

    public String getNameResenas() {
        return nameResenas;
    }

    public void setNameResenas(String nameResenas) {
        this.nameResenas = nameResenas;
    }

    public String getDescripcionResenas() {
        return descripcionResenas;
    }

    public void setDescripcionResenas(String descripcionResenas) {
        this.descripcionResenas = descripcionResenas;
    }
}
