package ar.edu.unlam.pb2;
import java.util.HashSet;
import java.util.Set;

public abstract class Transporte {
	
	protected Set<String> destinos;   //*tuve que usar protected para que las subclases puedan acceder*//
	private double capVolumen;
	private double capPeso;
	
	
	public Transporte (double capVolumen, double capPeso) {
		this.capPeso = capPeso;
		this.capVolumen = capVolumen;
        this.destinos = new HashSet<>();

		
	}
	
	public abstract boolean puedeTransportar (Paquete paquete);

    public Set<String> getDestinos() {
		return destinos;
	}


	public double getCapVolumen() {
		return capVolumen;
	}

	public double getCapPeso() {
		return capPeso;
	}


	
	
}
