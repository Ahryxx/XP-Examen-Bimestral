package Logica;

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

    @Test

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TraductorSanscritoTest {

    @Test
    public void testTraducirContraccion() {
        TraductorSanscrito traductor = new TraductorSanscrito();
        String traduccion = traductor.traducir("adho mukha svanasana");
        assertEquals("Perro mirando hacia abajo", traduccion);
    }

    @Test

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TraductorSanscritoTest {

    @Test
    public void testTraducirContraccion() {
        TraductorSanscrito traductor = new TraductorSanscrito();
        String traduccion = traductor.traducir("adho mukha svanasana");
        assertEquals("Perro mirando hacia abajo", traduccion);
    }

    @Test