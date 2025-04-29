package ar.edu.unlam.pb2;

public class Bicicletas extends Transporte {
	
	private int cantidadDePaquetes= 0;
	
	public Bicicletas() {
		super (0.125, 15);
		this.destino = new String[1]; //Solo usa una ciudad//
		

	}
	
	@Override 
	public boolean puedeTransportar(Paquete paquete) {
			if (cantidadDePaquetes >= 2) {
				return false;
			}
			if (paquete.getVolumen() > getCapVolumen() || paquete.getPeso() > getCapPeso()) {
				return false;
		}
			if (destino[0] == null) {
				destino[0] = paquete.getDestino();
			}
			
			if (!destino[0].equals(paquete.getDestino())) {
				return false;
			}
			
			cantidadDePaquetes++;
			return true;
	}
	
	public void agregarDestino(String destino) {
        if (this.destino[0] == null) {
            this.destino[0] = destino;
        } 
	}
}
