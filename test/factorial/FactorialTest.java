/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class FactorialTest {
      

    @Test
    public void testCalculo() {
        System.out.println("calculo 1");
        int n = 3;
        int expResult = 6;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCalculo2() {
        System.out.println("calculo 2");
        int n = 4;
        int expResult = 24;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);

    }
    

    
    @Test
    public void testCalculo3() {
        System.out.println("calculo 4");
        int n = 50;
        int expResult =0;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);

    }
}
