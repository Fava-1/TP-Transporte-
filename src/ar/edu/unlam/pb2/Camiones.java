package ar.edu.unlam.pb2;

public class Camiones extends Transporte{
	
	public Camiones () {
		
		super (20, 16000);
		
	}
	
	@Override 
	public boolean puedeTransportar(Paquete paquete) {
		if (paquete.getVolumen() > getCapVolumen() || paquete.getPeso() > getCapPeso()) {
			return false;
	}
		if (destinos.contains(paquete.getDestino())) {
	            return true;
	}
		if (destinos.size() < 50) {
            destinos.add(paquete.getDestino());
            return true;
        }
		return false;
	
	}
	 public void agregarDestino(String destino) {
	        if (destinos.size() < 50) {
	            destinos.add(destino);
	        }	
	 }
}
