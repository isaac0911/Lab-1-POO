/******************************************************************
SimuladorPerreraIncompleto.java
Autor: Tomás Gálvez P. $ Isaac Solórzano Quintana
Última modificación: 2021-07-08

Driver program que implementa el menú de opciones para el simulador
que entrenará voluntari@s.
******************************************************************/
import java.util.Scanner;

class SimuladorPerrera{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		//Se instancian el perro y la persona
		Persona p = new Persona();
		Perro perro = new Perro();
		
		//Se inicaliza la variable que permitirá mantener un ciclo al mostrarse en formulario
		int opcion = 0;
		
		//Se despliega el menú
		while (opcion != 5){
		
			System.out.println("\n\nBienvenido al simulador de entrenamiento de voluntarios. Que hara?");
			System.out.println("1. Nueva persona");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Sacar galleta");
			System.out.println("4. Interactuar");
			System.out.println("5. Salir\n\n");
			
			opcion = scan.nextInt();
			
			// Se ejecuta la opción ingresada
			if (opcion == 1){
				Persona nuevoP = new Persona();
				p = nuevoP;
				System.out.println("\n\nSe ha creado una nueva persona.");
			} else if (opcion == 2){
				Perro nuevoPerro = new Perro();
				perro = nuevoPerro;
				System.out.println("\n\nSe ha creado un nuevo perro.");
			} else if (opcion == 3){
				perro.psican(p);
			} else if (opcion == 4){
				String accion = perro.interactuar(perro.animo, perro.umbral);
				System.out.println(accion);
			} else if (opcion == 5){
				System.out.println("\n\nQue tenga un feliz dia! :)\n\n");
			}
		}
	}
}