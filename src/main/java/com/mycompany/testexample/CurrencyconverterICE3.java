/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexample;

/**
 * CurrencyconverterICE3 provides functionality to convert amounts
 * between different currencies using fixed, manually defined exchange rates.
 *
 * The class was developed using a Test Driven Development (TDD) approach,
 * where functionality was added incrementally based on failing JUnit tests
 * and then lightly refactored to improve readability and maintainability.
 *
 * The converter supports input validation, multiple currency pairs,
 * rounding to two decimal places, and case-insensitive currency codes.
 *
 * This implementation matches the scope of ICE 3 and focuses on demonstrating TDD principles.
 *
 * @author Krishna patel ,991764561
 */
public class CurrencyconverterICE3 {
    
     // double rate = 1.35;  // hardcoded (old)
    private static final double USD_TO_CAD_RATE = 1.35;
    private static final double CAD_TO_USD_RATE = 0.74;
    private static final double USD_TO_INR_RATE = 83.00;
    private static final double INR_TO_CAD_RATE = 0.016;
    // currency conversation price

    
    /* Initial first requirement simple developed code before refractor 
    public double convert(double amount, String from, String to) {
        if (from.equals("USD") && to.equals("CAD")) {
            return amount * 1.35;
        }
        return 0;
    }
    */

    public double convert(double amount, String from, String to) {
     
        //here  from.toUpperCase() would throw NullPointerException if from is null
    if (from == null || to == null) {
        throw new IllegalArgumentException("Currency cannot be null");
    }
    
    //refractor:- trim() handles inputs like "   " (spaces) as blank.
    if (from.trim().isEmpty() || to.trim().isEmpty()) {
        throw new IllegalArgumentException("Currency cannot be blank");
    }
        
        // toUpperCase() allows case-insensitive currency codes like "usd", "Usd", etc.
        from = from.toUpperCase();
        to = to.toUpperCase();
        
        // if (amount < 0) return 0;   // old hardcode
    if (amount < 0) { //refractored
        throw new IllegalArgumentException("Amount cannot be negative");
    }
    
    //perfect currency match because here we only support USD , INR ,CAD . 
     if (!(from.equals("USD") || from.equals("CAD") || from.equals("INR"))
        || !(to.equals("USD") || to.equals("CAD") || to.equals("INR"))) {
    throw new IllegalArgumentException("Unsupported currency");
}

    
    double converted = 0;
        if (from.equals(to)) {
            return amount;
        }

        if (from.equals("USD") && to.equals("CAD")) {
            // return amount * 1.35;   // old hardcoded value
            converted = amount * USD_TO_CAD_RATE;
        }
        if (from.equals("CAD") && to.equals("USD")) {
           // return amount * 0.74;  // old logic
           converted = amount * CAD_TO_USD_RATE; //refractored
        }
        if (from.equals("USD") && to.equals("INR")) {
    converted = amount * USD_TO_INR_RATE; //refractored
}
        if (from.equals("INR") && to.equals("CAD")) {
    converted = amount * INR_TO_CAD_RATE; //refractored
}

        //just additional check
if (converted == 0 && amount != 0) {
    throw new IllegalStateException("Conversion not implemented for: " + from + " -> " + to);
}

        
       //rounding to 2 places 
    converted = Math.round(converted * 100.0) / 100.0;
        
        return converted; //return final value
    }
    
}
