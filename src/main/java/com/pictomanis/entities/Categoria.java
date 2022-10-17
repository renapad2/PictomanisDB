package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "nameCategoria",length = 45,nullable = false)
    private String nameCategoria;

    public Categoria(){

    }

    public Categoria(int idCategoria,String nameCategoria){
        this.idCategoria = idCategoria;
        this.nameCategoria = nameCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNameCategoria() {
        return nameCategoria;
    }

    public void setNameCategoria(String nameCategoria) {
        this.nameCategoria = nameCategoria;
    }
}
