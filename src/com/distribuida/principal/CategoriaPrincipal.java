package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categoria categoria =new Categoria(1,"Fantasia","Es un aventura muy entretenida ");
		
		Categoria categoria2 =new Categoria(1,"Drama","Un relato profundamente emocional que conecta las vidas de tres mujeres en diferentes épocas: Virginia Woolf mientras escribe su novela La señora Dalloway, una ama de casa en los años 50 que encuentra consuelo en la literatura, y una mujer contemporánea que organiza una fiesta para su amigo enfermo de SIDA. Con una prosa elegante, Las Horas explora temas de identidad, sacrificio y el impacto de las pequeñas decisiones en la vida. ");
		
		Categoria categoria3 =new Categoria(1,"Suspenso","Rachel toma el mismo tren cada día, pasando frente a un vecindario que observa con fascinación. Desde la ventana del vagón, se inventa una vida perfecta para una pareja que ve todos los días, hasta que un suceso inesperado la involucra en sus vidas. Cuando una mujer desaparece, Rachel se convierte en una pieza clave en un caso lleno de giros inesperados. ");
		
		Categoria categoria4 =new Categoria(1,"Terror","Cuando Jack Torrance acepta un trabajo como cuidador de invierno en el aislado hotel Overlook, ve una oportunidad de comenzar de nuevo con su familia. Sin embargo, el hotel tiene una oscura historia de violencia que lentamente afecta a Jack, llevándolo hacia la locura. ");
		
		System.out.println(categoria.toString());
		System.out.println(categoria2.toString());
		System.out.println(categoria3.toString());
		System.out.println(categoria4.toString());

	}

}
