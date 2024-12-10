package com.distribuida.dao;

import java.util.List;
import com.distribuida.entities.Libro;

public interface LibroDAO {

    // Obtener todos los registros
	 public  List<Libro> findAll();

    // Obtener un registro por su ID
    public    Libro findOne(int id);

    // Agregar un nuevo registro
     public void add(Libro libro);

    // Actualizar un registro existente
     public  void up(Libro libro);

    // Eliminar un registro por su ID
     public   void del(int id);
}
