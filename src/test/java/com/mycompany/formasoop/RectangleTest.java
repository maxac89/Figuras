package com.mycompany.formasoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    // Constructors
    @Test
    void constructor_sinParametros_inicializaDimensionesEnCero() {
        Rectangle rectangle = new Rectangle();

        assertEquals(0.0f, rectangle.getBase());
        assertEquals(0.0f, rectangle.getHeight());
    }

    @Test
    void constructor_conDimensiones_inicializaDimensionesCorrectamente() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        assertEquals(5.0f, rectangle.getBase());
        assertEquals(3.0f, rectangle.getHeight());
    }

    @Test
    void constructor_conDimensionesYPosicion_inicializaValoresCorrectamente() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f, 10, 20);

        assertEquals(5.0f, rectangle.getBase());
        assertEquals(3.0f, rectangle.getHeight());
    }

    // Getters and setters
    @Test
    void setBase_conBasePositiva_actualizaBaseCorrectamente() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        rectangle.setBase(8.0f);

        assertEquals(8.0f, rectangle.getBase());
    }

    @Test
    void setHeight_conAlturaPositiva_actualizaAlturaCorrectamente() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        rectangle.setHeight(6.0f);

        assertEquals(6.0f, rectangle.getHeight());
    }

    @Test
    void getBase_conBaseInicializada_retornaBaseCorrecta() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        assertEquals(5.0f, rectangle.getBase());
    }

    @Test
    void getHeight_conAlturaInicializada_retornaAlturaCorrecta() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        assertEquals(3.0f, rectangle.getHeight());
    }

    // Calculations
    @Test
    void calculateArea_conDimensionesPositivas_retornaAreaCorrecta() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        assertEquals(15.0f, rectangle.calculateArea());
    }

    @Test
    void calculatePerimeter_conDimensionesPositivas_retornaPerimetroCorrecto() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);

        assertEquals(16.0f, rectangle.calculatePerimeter());
    }

    // Edge cases
    @Test
    void calculateArea_conBaseCero_retornaCero() {
        Rectangle rectangle = new Rectangle(0.0f, 5.0f);

        assertEquals(0.0f, rectangle.calculateArea());
    }

    @Test
    void calculatePerimeter_conBaseCero_retornaDobleAltura() {
        Rectangle rectangle = new Rectangle(0.0f, 5.0f);

        assertEquals(10.0f, rectangle.calculatePerimeter());
    }

    @Test
    void calculateArea_conDimensionesIguales_retornaAreaCorrecta() {
        Rectangle rectangle = new Rectangle(4.0f, 4.0f);

        assertEquals(16.0f, rectangle.calculateArea());
    }

    @Test
    void calculatePerimeter_conDimensionesIguales_retornaPerimetroCorrecto() {
        Rectangle rectangle = new Rectangle(4.0f, 4.0f);

        assertEquals(16.0f, rectangle.calculatePerimeter());
    }
}

