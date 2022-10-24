package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Idiomas")
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdiomas;
    @Column(name = "nameIdiomas",length = 45,nullable = false)
    private String nameIdiomas;
    @Column(name = "resenas",length = 45,nullable = false)
    private String resenas;

    public Idiomas(){

    }

    public Idiomas(int idIdioma,String nameIdioma,String resena){
        this.idIdiomas = idIdioma;
        this.nameIdiomas = nameIdioma;
        this.resenas = resena;
    }

    public int getIdIdiomas() {
        return idIdiomas;
    }

    public void setIdIdiomas(int idIdiomas) {
        this.idIdiomas = idIdiomas;
    }

    public String getNameIdiomas() {
        return nameIdiomas;
    }

    public void setNameIdiomas(String nameIdiomas) {
        this.nameIdiomas = nameIdiomas;
    }

    public String getResenas() {
        return resenas;
    }

    public void setResenas(String resenas) {
        this.resenas = resenas;
    }
}
