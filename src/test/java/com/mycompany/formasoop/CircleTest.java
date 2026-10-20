package com.mycompany.formasoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    // Constructors
    @Test
    void constructor_sinParametros_inicializaRadioEnCero() {
        Circle circle = new Circle();

        assertEquals(0.0f, circle.getRadius());
    }

    @Test
    void constructor_conRadio_inicializaRadioCorrectamente() {
        Circle circle = new Circle(5.0f);

        assertEquals(5.0f, circle.getRadius());
    }

    @Test
    void constructor_conRadioYPosicion_inicializaValoresCorrectamente() {
        Circle circle = new Circle(5.0f, 10, 20);

        assertEquals(5.0f, circle.getRadius());
    }

    // Getters and setters
    @Test
    void setRadius_conRadioPositivo_actualizaRadioCorrectamente() {
        Circle circle = new Circle(5.0f);

        circle.setRadius(8.0f);

        assertEquals(8.0f, circle.getRadius());
    }

    @Test
    void getRadius_conRadioInicializado_retornaRadioCorrecto() {
        Circle circle = new Circle(5.0f);

        assertEquals(5.0f, circle.getRadius());
    }

    // Calculations
    @Test
    void calculateArea_conRadioPositivo_retornaAreaCorrecta() {
        Circle circle = new Circle(5.0f);

        assertEquals((float) (Math.PI * Math.pow(5.0f, 2)),
                circle.calculateArea());
    }

    @Test
    void calculatePerimeter_conRadioPositivo_retornaPerimetroCorrecto() {
        Circle circle = new Circle(5.0f);

        assertEquals((float) (2 * Math.PI * 5.0f),
                circle.calculatePerimeter());
    }

    // Edge cases
    @Test
    void calculateArea_conRadioCero_retornaCero() {
        Circle circle = new Circle(0.0f);

        assertEquals(0.0f, circle.calculateArea());
    }

    @Test
    void calculatePerimeter_conRadioCero_retornaCero() {
        Circle circle = new Circle(0.0f);

        assertEquals(0.0f, circle.calculatePerimeter());
    }

    @Test
    void calculateArea_conRadioNegativo_retornaAreaPositiva() {
        Circle circle = new Circle(-5.0f);

        assertEquals((float) (Math.PI * Math.pow(-5.0f, 2)),
                circle.calculateArea());
    }

    @Test
    void calculatePerimeter_conRadioNegativo_retornaPerimetroNegativo() {
        Circle circle = new Circle(-5.0f);

        assertEquals((float) (2 * Math.PI * -5.0f),
                circle.calculatePerimeter());
    }
}

