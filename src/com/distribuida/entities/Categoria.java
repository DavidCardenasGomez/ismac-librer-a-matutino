package com.distribuida.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	 @Id // Asegúrate de marcar este atributo como la clave primaria	
 private int id_Categoria;
 private String categoria;
 private String descripcion;
 
 public Categoria() {}

public Categoria(int idCategoria, String categoria, String descripcion) {
	super();
	this.id_Categoria = idCategoria;
	this.categoria = categoria;
	this.descripcion = descripcion;
}

public int getIdCategoria() {
	return id_Categoria;
}

public void setIdCategoria(int idCategoria) {
	this.id_Categoria = idCategoria;
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
	return "Categoria [idCategoria=" + id_Categoria + ", categoria=" + categoria + ", descripcion=" + descripcion + "]";
}
 
}
