package com.distribuida.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Categoria {
    
    @Id  // Esto marca el campo como la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Esto indica que el valor será autogenerado por la base de datos (autoincremento)
    private int id_categoria;
    
    private String categoria;
    private String descripcion;
    
    public Categoria() {}

    public Categoria(int id_categoria, String categoria, String descripcion) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria [id_categoria=" + id_categoria + ", categoria=" + categoria + ", descripcion=" + descripcion + "]";
    }
}
