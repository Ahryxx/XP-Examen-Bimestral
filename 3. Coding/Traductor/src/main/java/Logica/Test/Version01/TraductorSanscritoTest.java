package Logica.Test.Version01;

import Logica.TraductorSanscrito;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TraductorSanscritoTest {

    @Test
    public void testTraducirPalabraDirecta() {
        TraductorSanscrito traductor = new TraductorSanscrito();
        assertEquals("Postura de la Montaña", traductor.traducir("tadasana"));
        assertEquals("abajo", traductor.traducir("adho"));
        assertEquals("cadáver", traductor.traducir("shava"));
    }
}