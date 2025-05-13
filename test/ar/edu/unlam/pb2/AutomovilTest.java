package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AutomovilTest {

	@Test
	public void queElAutomovilRechacePaquetePesado() {
			 	Automoviles auto = new Automoviles();
			 	
			 	Paquete pesado = new Paquete(0.25, 0.25 ,0.2 , 501, "Lanus");
			 	
			 	assertFalse(auto.puedeTransportar(pesado));
		 }
    @Test
    public void queElAutomovilAcepteTresDestinosDif() {
        Automoviles auto = new Automoviles();

        assertTrue(auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Lanus")));
        assertTrue(auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Avellaneda")));
        assertTrue(auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Quilmes")));
    }

    @Test
    public void queElAutomovilRechaceUnDestinoRepetido() {
        Automoviles auto = new Automoviles();

        auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Quilmes"));
        assertFalse(auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Quilmes")));
    }

    @Test
    public void queElAutomovilRechaceUnCuartoDestino() {
        Automoviles auto = new Automoviles();

        auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Lanus"));
        auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Avellaneda"));
        auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Quilmes"));
        
        
        assertFalse(auto.puedeTransportar(new Paquete(1, 1, 1, 100, "Lomas")));
    }
}
