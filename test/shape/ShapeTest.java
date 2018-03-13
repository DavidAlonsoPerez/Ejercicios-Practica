/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class ShapeTest {
    
    
    @Test
    public void testArea() {
        System.out.println("area cuadrado");
        Shape cuadrado1 = new Shape(1,5);
        double expResult = 25.0;
        double result = cuadrado1.area();
        assertEquals(expResult, result, 25.0);
    }
    
    @Test
    public void testArea2() {
        System.out.println("area circulo");
        Shape circulo1 = new Shape(1,2);
        double expResult =Math.PI;
        double result = circulo1.area();
        assertEquals(expResult, result, Math.PI);
    }
    
    @Test
    public void testArea3() {
        System.out.println("area triangulo");
        Shape triangulo1 = new Shape(1,6);
        double expResult = 18.0;
        double result = triangulo1.area();
        assertEquals(expResult, result, 18.0);
    }
}
