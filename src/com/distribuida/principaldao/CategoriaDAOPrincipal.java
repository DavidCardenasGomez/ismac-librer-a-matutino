package com.distribuida.principaldao;
 
import java.util.List;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
 
public class CategoriaDAOPrincipal {
 
    public static void main(String[] args) {
        // Cargar el contexto de Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
 
        // Obtener el bean de CategoriaDAO desde el contexto de Spring
        CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
 
        // INSERT (Crear un nuevo autor)
        //Categoria categoria = new Categoria(0, "Terror", "Categoria para libros de terror");
        //categoriaDAO.add(categoria);  // Descomentar para insertar el autor en la base de datos
 
        // UPDATE (Actualizar un autor existente)
       Categoria categoria2 = new Categoria(1, "Ciencia Ficcion", "Categorai para libro de Ciencia Ficcion");
       categoriaDAO.up(categoria2);  // Descomentar para actualizar el autor con ID 1
 
        // FIND ONE (Buscar un autor por ID)
      // try {
         // Categoria categoria3 = categoriaDAO.findOne(1);  // Buscar autor con ID 1
          // System.out.println(categoria3.toString());
      // } catch (Exception e) {
          // e.printStackTrace();
        //}
 
        // DELETE (Eliminar un autor por ID)
        //categoriaDAO.del(55);  // Descomentar para eliminar el autor con ID 1
 
        // FIND ALL (Obtener todos los autores)
        List<Categoria> categorias = categoriaDAO.findAll();
        for (Categoria item : categorias) {
            System.out.println(item.toString());
        }
 
        // Cerrar el contexto de Spring
        context.close();
    }
}