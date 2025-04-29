package ar.edu.unlam.pb2;

public class Camiones extends Transporte{
	private int cantidadDestinos = 0;
	
	public Camiones () {
		super (20, 16000);
		this.destino = new String[50];  //todas las ciudades necesarias pero en este caso puse 50//
		
	}
	
	@Override 
	public boolean puedeTransportar(Paquete paquete) {
		if (paquete.getVolumen() > getCapVolumen() || paquete.getPeso() > getCapPeso()) {
			return false;
	}
	for(int i = 0; i < destino.length; i++) {
		if(destino[i] != null && destino[i].equals(paquete.getDestino())) {
			return true;
		}
	}
	
		destino[cantidadDestinos++] = paquete.getDestino();
		return true;
	}
	 public void agregarDestino(String destino) {
	        if (cantidadDestinos < this.destino.length) {
	            this.destino[cantidadDestinos++] = destino;
	        }	
	 }
}
