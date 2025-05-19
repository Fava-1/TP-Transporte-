package ar.edu.unlam.pb2;

public class Automoviles extends Transporte {
	
	public Automoviles() {
		super (2, 500);
		}
	
	
	@Override 
	public boolean puedeTransportar(Paquete paquete) {
		if (paquete.getVolumen() > getCapVolumen() || paquete.getPeso() > getCapPeso()) {
			return false;
			
			}
		if (destinos.contains(paquete.getDestino())) {
            return false;
        }
			
			
		if (destinos.size() < 3) {
			destinos.add(paquete.getDestino());
         return true;
     }
		return false;
	
	}
	public void agregarDestino(String destino) {
		if (destinos.size() < 3) {
            destinos.add(destino);
        }
	}
}

