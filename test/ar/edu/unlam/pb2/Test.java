package ar.edu.unlam.pb2;

import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
			
		Bicicletas bici = new Bicicletas();
		Camiones camion = new Camiones();
		Automoviles auto = new Automoviles();
		
			String continuar;
				do {
					String seguirDestinos;
						do {
							System.out.print("Ingrese un destino para registrar:");
							String destino = scanner.nextLine();
	                
							bici.agregarDestino(destino); 
							auto.agregarDestino(destino);
							camion.agregarDestino(destino);

							System.out.print("¿Desea ingresar otro destino? (s/n):");
							seguirDestinos = scanner.nextLine();

							} while (seguirDestinos.equalsIgnoreCase("s"));
			
			System.out.println("Ingrese el alto del paquete (en metros):");
			double alto = scanner.nextDouble();
			
			System.out.println("Ingrese el ancho del paquete (en metros):");
			double ancho = scanner.nextDouble();
			
			System.out.println("Ingrese el profundidad del paquete (en metros):");
			double profundo = scanner.nextDouble();
			
			System.out.println("Ingrese el peso del paquete (en Kilogramos):");
			double peso = scanner.nextDouble();
			scanner.nextLine();  //Limpia buffer
			
			System.out.println("Ingrese el destino");
			String destino = scanner.nextLine();

		Paquete paquete = new Paquete(alto, ancho, profundo, peso, destino);
		
		
		System.out.println("Puede transportar el paquete?");
		if(bici.puedeTransportar(paquete)){
			System.out.println("La bicicleta puede transportarlo");
		}
		else System.out.println("La bicicleta no puede transportarlo");
		
		if(auto.puedeTransportar(paquete)){
			System.out.println("El automovil puede transportarlo");
		}
		else System.out.println("El automovil no puede transportarlo");
		
		if(camion.puedeTransportar(paquete)){
			System.out.println("El camion puede transportarlo");
		}
		else System.out.println("El camion no puede transportarlo");

		System.out.println("Desea ingresar otro paquete ? (s/n)");
		
		continuar = scanner.nextLine();
		
			}	while (continuar.equalsIgnoreCase("s"));
		}
	
	}
