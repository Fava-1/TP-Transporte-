package ar.edu.unlam.pb2;

public abstract class Transporte {
	
	protected String[] destino;   //*tuve que usar protected para que las subclases puedan acceder*//
	private double capVolumen;
	private double capPeso;
	
	
	public Transporte (double capVolumen, double capPeso) {
		this.capPeso = capPeso;
		this.capVolumen = capVolumen;
		
	}
	
	public abstract boolean puedeTransportar (Paquete paquete);

	public String[] getDestino() {
		return destino;
	}


	public double getCapVolumen() {
		return capVolumen;
	}

	public double getCapPeso() {
		return capPeso;
	}


	
	
}
