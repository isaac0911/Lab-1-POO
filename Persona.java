/******************************************************************
Persona.java
Autor: Isaac Solórzano Q.
Última modificación: 2021-07-08

Programa que modela una persona.
******************************************************************/

import java.util.Random;

class Persona {
	
	// Se declaran las propiedades de la persona
	private float Confiabilidad;
	private boolean Galleta;
	
	// Método Constructor inicializa las propiedades de la instancia de persona
	public Persona (){
		
		Random r = new Random();
		
		Confiabilidad = r.nextFloat()*10;
		Galleta = r.nextBoolean();
	}
	
	// Método getConfiabilidad devuelve el valor de la confiabilidad de la persona. Se usa un getter, porque la propiedad "Confiablidad" es privada
	public float getConfiabilidad (){
		return Confiabilidad;
	}
	
	// Método tieneGalleta devuelve una variable tipo boolean indicando si la persona tiene o no una galleta
	public boolean tieneGalleta (){
		return Galleta;
	}
	
	// Método darGalleta establece el valor de la propiedad Galleta como false, indicando que la persona ya dio su galleta, y por ende, se queda sin ella.
	public void darGalleta (){
		Galleta = false;
	}
}