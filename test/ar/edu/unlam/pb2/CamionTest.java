package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CamionTest {

	@Test
	public void queElCamionRechacePaquetePesado() {
			 	Camiones camion = new Camiones();
			 	
			 	Paquete pesado = new Paquete(0.25, 0.25 ,0.2 , 16001, "Lanus");
			 	
			 	assertFalse(camion.puedeTransportar(pesado));
		 }
    @Test
    public void queElCamionPuedaTransportarVariosDestinos() {
        Camiones camion = new Camiones();

        for (int i = 0; i < 10; i++) {
            assertTrue(camion.puedeTransportar(new Paquete(1, 1, 1, 1000, "ciudad" + i)));
        }
    }

    @Test
    public void queElCamionRechacePaqueteConExcesoDeVolumen() {
        Camiones camion = new Camiones();

        Paquete paqueteGrande = new Paquete(5, 2, 3, 1000, "Quilmes");
        assertFalse(camion.puedeTransportar(paqueteGrande));
    }
	

}

