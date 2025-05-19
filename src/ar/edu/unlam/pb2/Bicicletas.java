package ar.edu.unlam.pb2;

public class Bicicletas extends Transporte {
	
	private int cantidadDePaquetes= 0;
	
	public Bicicletas() {
		super (0.125, 15);
		

	}
	
	@Override 
	public boolean puedeTransportar(Paquete paquete) {
			if (cantidadDePaquetes >= 2) {
				return false;
			}
			if (paquete.getVolumen() > getCapVolumen() || paquete.getPeso() > getCapPeso()) {
				return false;
		}
			 if (destinos.isEmpty()) {
		            destinos.add(paquete.getDestino());
		        }
			
			  if (!destinos.contains(paquete.getDestino())) {
		            return false;
		        }
			
			cantidadDePaquetes++;
			return true;
	}
	
	public void agregarDestino(String destino) {
		if (destinos.isEmpty()) {
            destinos.add(destino);
        }
	}
}
