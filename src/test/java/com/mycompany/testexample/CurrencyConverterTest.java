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
public class CurrencyConverterTest {
    
 
    @Test
    void ConvertUsdToCad_usingApi() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convertUsdToCad(10.0);

        // We don't hardcode the exact value because rates change
        assertTrue(result > 10.0);
    }
}
