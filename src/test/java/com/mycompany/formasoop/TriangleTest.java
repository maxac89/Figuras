
package com.mycompany.formasoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    // Constructors
    @Test
    void constructor_sinParametros_inicializaDimensionesEnCero() {
        Triangle triangle = new Triangle();

        assertEquals(0.0f, triangle.getBase());
        assertEquals(0.0f, triangle.getHeight());
    }

    @Test
    void constructor_conDimensiones_inicializaDimensionesCorrectamente() {
        Triangle triangle = new Triangle(6.0f, 4.0f);

        assertEquals(6.0f, triangle.getBase());
        assertEquals(4.0f, triangle.getHeight());
    }

    @Test
    void constructor_conDimensionesYPosicion_inicializaValoresCorrectamente() {
        Triangle triangle = new Triangle(6.0f, 4.0f, 10, 20);

        assertEquals(6.0f, triangle.getBase());
        assertEquals(4.0f, triangle.getHeight());
    }

    // Getters and setters
    @Test
    void setBase_conBasePositiva_actualizaBaseCorrectamente() {
        Triangle triangle = new Triangle(6.0f, 4.0f);

        triangle.setBase(8.0f);

        assertEquals(8.0f, triangle.getBase());
    }

    @Test
    void setHeight_conAlturaPositiva_actualizaAlturaCorrectamente() {
        Triangle triangle = new Triangle(6.0f, 4.0f);

        triangle.setHeight(5.0f);

        assertEquals(5.0f, triangle.getHeight());
    }

    @Test
    void getBase_conBaseInicializada_retornaBaseCorrecta() {
        Triangle triangle = new Triangle(6.0f, 4.0f);

        assertEquals(6.0f, triangle.getBase());
    }

    @Test
    void getHeight_conAlturaInicializada_retornaAlturaCorrecta() {
        Triangle triangle = new Triangle(6.0f, 4.0f);

        assertEquals(4.0f, triangle.getHeight());
    }

    // Calculations
    @Test
    void calculateArea_conDimensionesPositivas_retornaAreaCorrecta() {
        Triangle triangle = new Triangle(6.0f, 4.0f);

        assertEquals(12.0f, triangle.calculateArea());
    }

    @Test
    void calculatePerimeter_conDimensionesPositivas_retornaPerimetroCorrecto() {
        Triangle triangle = new Triangle(3.0f, 4.0f);

        assertEquals(12.0f, triangle.calculatePerimeter());
    }

    // Edge cases
    @Test
    void calculateArea_conBaseCero_retornaCero() {
        Triangle triangle = new Triangle(0.0f, 4.0f);

        assertEquals(0.0f, triangle.calculateArea());
    }

    @Test
    void calculateArea_conAlturaCero_retornaCero() {
        Triangle triangle = new Triangle(6.0f, 0.0f);

        assertEquals(0.0f, triangle.calculateArea());
    }

    @Test
    void calculatePerimeter_conBaseCero_retornaDobleAltura() {
        Triangle triangle = new Triangle(0.0f, 4.0f);

        assertEquals(8.0f, triangle.calculatePerimeter());
    }

    @Test
    void calculatePerimeter_conAlturaCero_retornaDobleBase() {
        Triangle triangle = new Triangle(6.0f, 0.0f);

        assertEquals(12.0f, triangle.calculatePerimeter());
    }

    @Test
    void calculateArea_conDimensionesIguales_retornaAreaCorrecta() {
        Triangle triangle = new Triangle(4.0f, 4.0f);

        assertEquals(8.0f, triangle.calculateArea());
    }

    @Test
    void calculatePerimeter_conDimensionesIguales_retornaPerimetroCorrecto() {
        Triangle triangle = new Triangle(4.0f, 4.0f);

        assertEquals(
                (float) (8.0f + Math.sqrt(32.0)),
                triangle.calculatePerimeter()
        );
    }
}
