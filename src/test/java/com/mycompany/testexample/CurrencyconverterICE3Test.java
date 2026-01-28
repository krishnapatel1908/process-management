/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class verifies the functionality of the CurrencyconverterICE3
 * using Test Driven Development (TDD).
 *
 * JUnit test cases are written to validate currency conversion logic,
 * input validation (negative, null, blank, and unsupported values),
 * rounding behavior, and edge cases such as large amounts and
 * case-insensitive currency codes.
 *
 * Each test either drives new functionality or confirms that
 * previously implemented behavior continues to work correctly as well , Thank you.
 * 
 * @author Krishna patel , 991764561
 */
public class CurrencyconverterICE3Test {
    
    public CurrencyconverterICE3Test() {
    }
    
 
// USD to CAD test
    @Test
    void convert_USDToCAD_returnsExpectedAmount() {
        CurrencyconverterICE3 converter = new CurrencyconverterICE3();

        double result = converter.convert(10.00, "USD", "CAD");

        assertEquals(13.50, result, 0.0001);
    }
    
    // CAD to USD test
    @Test
void convert_CADToUSD_returnsExpectedAmount() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(10.0, "CAD", "USD");

    assertEquals(7.40, result, 0.001);
}

// Same Currency Test
@Test
void convert_sameCurrency_returnsSameAmount() {
   CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(25.0, "USD", "USD");

    assertEquals(25.0, result, 0.001);
}

// Negative Amount Test
@Test
void convert_negativeAmount_throwsIllegalArgumentException() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    assertThrows(IllegalArgumentException.class, () -> {
        converter.convert(-5.0, "USD", "CAD");
    });
}

// Zero Amount Test
@Test
void convert_zeroAmount_returnsZero() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(0.0, "USD", "CAD");

    assertEquals(0.0, result, 0.001);
}

// Null Currency Test (from currency)
@Test
void convert_nullFromCurrency_throwsIllegalArgumentException() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    assertThrows(IllegalArgumentException.class, () -> {
        converter.convert(10.0, null, "CAD");
    });
}

// Null Currency Test (to currency)
@Test
void convert_nullToCurrency_throwsIllegalArgumentException() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    assertThrows(IllegalArgumentException.class, () -> {
        converter.convert(10.0, "USD", null);
    });
}

// Blank Currency Test (from currency)
@Test
void convert_blankFromCurrency_throwsIllegalArgumentException() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    assertThrows(IllegalArgumentException.class, () -> {
        converter.convert(10.0, "   ", "CAD");
    });
}

// Unsupported Currency Test
@Test
void convert_unsupportedCurrency_throwsIllegalArgumentException() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    assertThrows(IllegalArgumentException.class, () -> {
        converter.convert(10.0, "EUR", "CAD");
    });
}
@Test // Unsupported Currency test2
void convert_unsupportedToCurrency_throwsIllegalArgumentException() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    assertThrows(IllegalArgumentException.class, () -> {
        converter.convert(10.0, "USD", "JPY");
    });
}

// Rounding Test (2 decimals)
@Test
void convert_roundsResultToTwoDecimalPlaces() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(1.333, "USD", "CAD");

    assertEquals(1.80, result, 0.001);
}

//USD to INR conversion
@Test
void convert_USDToINR_returnsExpectedAmount() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(2.0, "USD", "INR");

    assertEquals(166.00, result, 0.001);
}

// INR to CAD test
@Test
void convert_INRToCAD_returnsExpectedAmount() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(100.0, "INR", "CAD");

    assertEquals(1.60, result, 0.01);
}

// Case-insensitive currency codes test
@Test
void convert_caseInsensitiveCurrencyCodes_returnsCorrectAmount() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(10.0, "usd", "cad");

    assertEquals(13.50, result, 0.01);
}

// Large amount conversion test
@Test
void convert_largeAmount_returnsCorrectResult() {
    CurrencyconverterICE3 converter = new CurrencyconverterICE3();

    double result = converter.convert(100000.0, "USD", "CAD");

    assertEquals(135000.00, result, 0.01);
}



}
