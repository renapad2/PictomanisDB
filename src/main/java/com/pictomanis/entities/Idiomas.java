package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Idiomas")
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdioma;
    @Column(name = "nameIdioma",length = 45,nullable = false)
    private String nameIdioma;
    @Column(name = "resena",length = 45,nullable = false)
    private String resena;

    public Idiomas(){

    }

    public Idiomas(int idIdioma,String nameIdioma,String resena){
        this.idIdioma = idIdioma;
        this.nameIdioma = nameIdioma;
        this.resena = resena;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNameIdioma() {
        return nameIdioma;
    }

    public void setNameIdioma(String nameIdioma) {
        this.nameIdioma = nameIdioma;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }
}
