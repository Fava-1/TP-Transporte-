package ar.edu.unlam.pb2;

public class Automoviles extends Transporte {
	private int cantidadDestinos = 0;
	
	public Automoviles() {
		super (2, 500);
		this.destino = new String[3];  //3 ciudades maximo//
		}
	
	
	@Override 
	public boolean puedeTransportar(Paquete paquete) {
		if (paquete.getVolumen() > getCapVolumen() || paquete.getPeso() > getCapPeso()) {
			return false;
			
			}
			for ( int i = 0; i < destino.length; i++) {
				if(destino[i] != null && destino[i].equals(paquete.getDestino())) {
					return false;
				}
			}
			
		if (cantidadDestinos < destino.length) {
			destino[cantidadDestinos++] = paquete.getDestino();
			return true;
	}
		return false;
	
	}
	public void agregarDestino(String destino) {
        if (cantidadDestinos < this.destino.length) {
            this.destino[cantidadDestinos++] = destino;
        }
	}
}

