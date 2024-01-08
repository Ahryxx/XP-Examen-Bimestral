package Logica.Test.verson03;

import Logica.TraductorSanscrito;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TraductorSanscritoTest {

    @Test
    public void testTraducirContraccion() {
        TraductorSanscrito traductor = new TraductorSanscrito();
        String traduccion = traductor.traducir("adho mukha svanasana");
        assertEquals("Perro mirando hacia abajo", traduccion);
    }
}