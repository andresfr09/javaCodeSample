package co.edu.udem.devops.taller1.Taller14F.ws.operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    @Test
    void suma() {
        double resultado = Operaciones.suma(10.5,14.5);
        double esperado = 25;
        assertEquals(esperado,resultado);
    }

    @Test
    void resta() {
        double resultado = Operaciones.resta(25.5,10.5);
        double esperado = 15;
        assertEquals(esperado,resultado);
    }

    /*@Test
    void main() {
    }*/
}