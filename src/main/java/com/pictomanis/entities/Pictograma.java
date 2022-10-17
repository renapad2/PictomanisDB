package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Pictograma")
public class Pictograma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPictograma;
    @Column(name = "namePictograma",length = 45,nullable = false)
    private String namePictograma;
    @Column(name = "idUsuario",length = 45,nullable = false)
    private int idUsuario;

    public Pictograma(){

    }

    public Pictograma(int idPictograma,String namePictograma,int idUsuario){
        this.idPictograma = idPictograma;
        this.namePictograma = namePictograma;
        this.idUsuario = idUsuario;
    }

    public int getIdPictograma() {
        return idPictograma;
    }

    public void setIdPictograma(int idPictograma) {
        this.idPictograma = idPictograma;
    }

    public String getNamePictograma() {
        return namePictograma;
    }

    public void setNamePictograma(String namePictograma) {
        this.namePictograma = namePictograma;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
