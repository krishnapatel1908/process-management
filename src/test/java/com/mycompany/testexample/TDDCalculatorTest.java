/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patel
 */
public class TDDCalculatorTest {
    
    public TDDCalculatorTest() {
    }
   

    @Test
    public void testDividetwopositive() {
        
      //arrange  
      TDDCalculator calc = new TDDCalculator();
      
      //act
      
     double result = calc.divide(6,2);
     //assert
     assertEquals(3,result);
    }
    
    @Test
    public void testDividebyzero() {
        
      //arrange  
      TDDCalculator calc = new TDDCalculator();
      
      //act
      
     double result = calc.divide(6,0);
     //assert
     assertEquals(0 ,result);
    }
    
}
