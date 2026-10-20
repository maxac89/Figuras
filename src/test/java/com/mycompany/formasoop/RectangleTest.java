package com.mycompany.formasoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    
    @Test
    public void areaRectangulo_numerosPositivos_retornaAreaCorrecta() {

        //Preparación (Arrange)
        Rectangle rect = new Rectangle(10, 15, 6, 7);

        //Ejecución (Act)
        float result = rect.calculateArea();
        
        //Verificación (Assert)
        float expResult = 150;
        assertEquals(expResult, result);
    }
    
    @Test
    public void perimetroRectangulo_numerosPositivos_retornaPerimetroCorrecta() {

        //Preparación (Arrange)
        Rectangle rect = new Rectangle(10, 15, 6, 7);

        //Ejecución (Act)
        float result = rect.calculatePerimeter();
        
        //Verificación (Assert)
        float expResult = 50;
        assertEquals(expResult, result);
    }
}
