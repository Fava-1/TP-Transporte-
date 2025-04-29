package ar.edu.unlam.pb2;

public class Paquete {
	private double alto;
	private double ancho;
	private double profundo;
	private double peso;
	private double volumen;
	private String destino;
	
	
	
	public Paquete (double alto, double ancho, double profundo, double peso, String destino) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
		this.peso = peso;
		this.destino = destino;
		
	}
	
	
	public double calcularVolumen() {
		
		this.volumen = alto * ancho * profundo;
		return volumen;
		
		
	}


	public double getPeso() {
		return peso;
	}

	public double getVolumen() {			//Calcular volumen ya hace esto pero me olvide de sacar esta parte//
		return calcularVolumen();
	}
	
	public String getDestino() {
		return destino;
	}
	
	
}
