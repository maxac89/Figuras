
package com.mycompany.formasoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    // Constructors
    @Test
    void constructor_sinParametros_inicializaCoordenadasEnCero() {
        Coordinate coordinate = new Coordinate();

        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
    }

    @Test
    void constructor_conCoordenadas_inicializaValoresCorrectamente() {
        Coordinate coordinate = new Coordinate(10, 20);

        assertEquals(10, coordinate.getX());
        assertEquals(20, coordinate.getY());
    }

    @Test
    void constructor_conCoordenadasNegativas_inicializaValoresCorrectamente() {
        Coordinate coordinate = new Coordinate(-5, -10);

        assertEquals(-5, coordinate.getX());
        assertEquals(-10, coordinate.getY());
    }

    // Getters and setters
    @Test
    void getX_conCoordenadaInicializada_retornaValorCorrecto() {
        Coordinate coordinate = new Coordinate(10, 20);

        assertEquals(10, coordinate.getX());
    }

    @Test
    void getY_conCoordenadaInicializada_retornaValorCorrecto() {
        Coordinate coordinate = new Coordinate(10, 20);

        assertEquals(20, coordinate.getY());
    }

    @Test
    void setX_conNuevoValor_actualizaCoordenadaCorrectamente() {
        Coordinate coordinate = new Coordinate(10, 20);

        coordinate.setX(30);

        assertEquals(30, coordinate.getX());
    }

    @Test
    void setY_conNuevoValor_actualizaCoordenadaCorrectamente() {
        Coordinate coordinate = new Coordinate(10, 20);

        coordinate.setY(40);

        assertEquals(40, coordinate.getY());
    }

    @Test
    void setX_conValorNegativo_actualizaCoordenadaCorrectamente() {
        Coordinate coordinate = new Coordinate(10, 20);

        coordinate.setX(-15);

        assertEquals(-15, coordinate.getX());
    }

    @Test
    void setY_conValorNegativo_actualizaCoordenadaCorrectamente() {
        Coordinate coordinate = new Coordinate(10, 20);

        coordinate.setY(-25);

        assertEquals(-25, coordinate.getY());
    }

    // Other methods
    @Test
    void getXAndY_conCoordenadasPositivas_retornaCadenaCorrecta() {
        Coordinate coordinate = new Coordinate(10, 20);

        assertEquals("X:10 y Y:20", coordinate.getXAndY());
    }

    @Test
    void getXAndY_conCoordenadasNegativas_retornaCadenaCorrecta() {
        Coordinate coordinate = new Coordinate(-5, -10);

        assertEquals("X:-5 y Y:-10", coordinate.getXAndY());
    }

    @Test
    void getXAndY_conCoordenadasEnCero_retornaCadenaCorrecta() {
        Coordinate coordinate = new Coordinate(0, 0);

        assertEquals("X:0 y Y:0", coordinate.getXAndY());
    }

    @Test
    void getXAndY_trasModificarCoordenadas_retornaValoresActualizados() {
        Coordinate coordinate = new Coordinate(10, 20);

        coordinate.setX(30);
        coordinate.setY(40);

        assertEquals("X:30 y Y:40", coordinate.getXAndY());
    }
}
