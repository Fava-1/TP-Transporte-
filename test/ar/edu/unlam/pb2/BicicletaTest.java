package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BicicletaTest {

	@Test
	public void queLaBicicletaRechacePaquetePesado() {
			 Bicicletas bici = new Bicicletas();
			 	
			 Paquete pesado = new Paquete(0.25, 0.25 ,0.2 , 16, "Lanus");
			 	
			 assertFalse(bici.puedeTransportar(pesado));
		 }
	@Test
	public void queLaBiciPuedaTransportarDosPaquetesValidosDelMismoDestino() {
			Bicicletas bici = new Bicicletas();
		
			Paquete paquete1 = new Paquete(0.2, 0.25, 0.25, 5, "Lanus");
			Paquete paquete2 = new Paquete(0.2, 0.2, 0.25, 2, "Lanus");

		assertTrue(bici.puedeTransportar(paquete1));
		assertTrue(bici.puedeTransportar(paquete2));
	}
	@Test
	public void queLaBicicletaRechaceTercerPaquete() {
			Bicicletas bici = new Bicicletas();

	    	bici.puedeTransportar(new Paquete(0.25, 0.25, 0.2, 5, "Lanus"));
	        bici.puedeTransportar(new Paquete(0.25, 0.25, 0.2, 5, "Lanus"));

	        Paquete paquete3 = new Paquete(0.25, 0.25, 0.2, 5, "Lanus");
	        assertFalse(bici.puedeTransportar(paquete3));
	    }
	@Test
	public void queLaBicicletaRechaceDestinoDistinto() {
	        Bicicletas bici = new Bicicletas();

	        bici.puedeTransportar (new Paquete(0.25, 0.25, 0.2, 5, "Lanus"));
	        Paquete otroDestino = new Paquete(0.25, 0.25, 0.2, 5, "Avellaneda");

	        assertFalse(bici.puedeTransportar(otroDestino));
	    }

}
