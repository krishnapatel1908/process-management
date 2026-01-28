/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexample;

/**
 *
 * @author patel
 */
public class TDDCalculator {

    double divide(double i, double j) {
        
        if(j==0){
            return 0;
        }
        
        double result = i / j ;
        
        return result;
    }
    
}
