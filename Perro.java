/******************************************************************
Perro.java
Autor: Isaac Solórzano Q.
Última modificación: 2021-07-08

Programa que modela un perro y hace que este interactúe con una persona.
******************************************************************/

import java.util.Random;

class Perro {
	
	//Se declaran las propiedades del perro
	private Random rand;
	public float animo;
	public float umbral;
	
	//Método Constructor inicializa las propiedades de lainstancia de perro
	public Perro (){
		
		rand = new Random();
		animo = rand.nextFloat()*10-5;
		umbral = rand.nextFloat()*20-20;
	}
	
	//Método psican altera el estado de ánimo del perro en función de la confiabilidad de la persona y si esta tiene o no una galleta
	public void psican (Persona p){
		
		Random ran = new Random();
		
		this.animo = (float)((1.0 / p.getConfiabilidad())*(ran.nextFloat()-0.5)*10) + this.animo;
		if (p.tieneGalleta()){ //Si la persona tiene galleta, se ejecuta este if, aumentando el estado de ánimo del perro.
			p.darGalleta();
			this.animo += (1.0/p.getConfiabilidad()) * (ran.nextInt(2));
		}
	
		System.out.println("\n\nMi nuevo animo es: " + animo);
	}
	
	//Método interactuar hace que la persona interactue con el perro
	public String interactuar (float animo, float umbral){
		
		String mensaje = "El perro no hace nada"; // Este String sirve para definir algo dentro de la variable "mensaje", en caso no se ejecute ninguno de los if's que vienen a continuación
		
		if (animo > 0){
			mensaje = moverCola();
		} else if(animo<=0 && animo>=umbral){
			mensaje = ladrar();
		} else if(animo<umbral){
			mensaje = morder();
		}
		return mensaje;
	}
	
	//Metodo morder devuelve el mensaje que se muestra cuando el perro muerde a la persona
	private String morder (){
		String m = "\n\nEl perro te ha mordido\n\nAhhhh!!!! UNA AMBULANCIA!!!!";
		return m;
	}
	
	//Metodo ladrar devuelve el mensaje que se muestra cuando el perro le ladra a la persona
	private String ladrar (){
		String m = "\n\nEl perro te ha ladrado\n\nHuy!, mejor me voy.";
		return m;
	}
	
	//Metodo moverCola devuelve el mensaje que se muestra cuando el perro mueve su cola
	private String moverCola (){
		String m = "\n\nEl perro ha movido su cola\n\nAwww! Que lindo!";
		return m;
	}
}


