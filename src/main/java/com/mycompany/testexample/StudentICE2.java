/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexample;

/**
 *
 * @author Krishna Patel
 */
public class StudentICE2 {
     private String name;
    private double gpa;
    private int creditsCompleted;

    public StudentICE2(String name, double gpa, int creditsCompleted) {
        this.name = name;
        this.gpa = gpa;
        this.creditsCompleted = creditsCompleted;
    }

    // 1: Honors eligibility 
    public boolean isEligibleForHonors() {
        return gpa >= 3.6;
    }

    // 2: probation 
    public boolean isOnProbation() {
        return gpa < 2.0;
    }

    // 3: Graduation eligibility
    public boolean canGraduate() {
        return gpa >= 2.0 && creditsCompleted >= 120;
    }

    
    //regular methods
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }
}
