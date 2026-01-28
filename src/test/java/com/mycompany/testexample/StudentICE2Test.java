/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

/**
 *
 * @author Krishna patel
 */
public class StudentICE2Test {
    
    public StudentICE2Test() {
    }
  

   // ----------- Honors Eligiblity Test -----------

    // GOOD CASE: GPA is above 3.6
    @org.junit.jupiter.api.DisplayName("Honors Eligibility — Good Case")
    @org.junit.jupiter.api.Test
    public void testIsEligibleForHonorsGood() {
        System.out.println("isEligibleForHonors");
        StudentICE2 s = new StudentICE2("Krishna", 3.8, 90);
        boolean expResult = true;
        boolean result = s.isEligibleForHonors();
        assertEquals(expResult, result);
    }

    // BAD CASE: GPA is below 3.6
    @org.junit.jupiter.api.DisplayName("Honors Eligibility — Bad Case ")
    @org.junit.jupiter.api.Test
    public void testIsEligibleForHonorsBad() {
        System.out.println("isEligibleForHonors");
        StudentICE2 s = new StudentICE2("Krishna", 3.2, 90);
        boolean expResult = false;
        boolean result = s.isEligibleForHonors();
        assertEquals(expResult, result);
    }

    // BOUNDARY CASE: GPA is exactly 3.6
    @org.junit.jupiter.api.DisplayName("Honors Eligibility — Boundary Case ")
    @org.junit.jupiter.api.Test
    public void testIsEligibleForHonorsBoundary() {
        System.out.println("isEligibleForHonors");
        StudentICE2 s = new StudentICE2("Krishna", 3.6, 90);
        boolean expResult = true;
        boolean result = s.isEligibleForHonors();
        assertEquals(expResult, result);
    }

    // ----------- Probation Test with Example 2GPA -----------

    // GOOD CASE: GPA is below 2.0
    @org.junit.jupiter.api.DisplayName("Probation Status — Good Case")
    @org.junit.jupiter.api.Test
    public void testIsOnProbationGood() {
        System.out.println("isOnProbation");
        StudentICE2 s = new StudentICE2("Krishna", 1.5, 60);
        boolean expResult = true;
        boolean result = s.isOnProbation();
        assertEquals(expResult, result);
    }

    // BAD CASE: GPA is above 2.0
    @org.junit.jupiter.api.DisplayName("Probation Status — Bad Case ")
    @org.junit.jupiter.api.Test
    public void testIsOnProbationBad() {
        System.out.println("isOnProbation");
        StudentICE2 s = new StudentICE2("Krishna", 2.5, 60);
        boolean expResult = false;
        boolean result = s.isOnProbation();
        assertEquals(expResult, result);
    }

    // BOUNDARY CASE: GPA is exactly 2.0
    @org.junit.jupiter.api.DisplayName("Probation Status — Boundary Case")
    @org.junit.jupiter.api.Test
    public void testIsOnProbationBoundary() {
        System.out.println("isOnProbation");
        StudentICE2 s = new StudentICE2("Krishna", 2.0, 60);
        boolean expResult = false;
        boolean result = s.isOnProbation();
        assertEquals(expResult, result);
    }

    // ----------- Graduation Tests -----------

    // GOOD CASE: Pass Both requirements
    @org.junit.jupiter.api.DisplayName("Graduation Eligibility — Good Case")
    @org.junit.jupiter.api.Test
    public void testCanGraduateGood() {
        System.out.println("canGraduate");
        StudentICE2 s = new StudentICE2("Krishna", 3.0, 130);
        boolean expResult = true;
        boolean result = s.canGraduate();
        assertEquals(expResult, result);
    }

    // BAD CASE: GPA below 2.0 so one requirement fails not qualify for graduation
    @org.junit.jupiter.api.DisplayName("Graduation Eligibility — Bad Case 1")
    @org.junit.jupiter.api.Test
    public void testCanGraduateBadGpa() {
        System.out.println("canGraduate");
        StudentICE2 s = new StudentICE2("Krishna", 1.9, 130);
        boolean expResult = false;
        boolean result = s.canGraduate();
        assertEquals(expResult, result);
    }

    // BAD CASE: Credits below 120 so one requirement fails not qualify for graduation
    @org.junit.jupiter.api.DisplayName("Graduation Eligibility — Bad Case 2")
    @org.junit.jupiter.api.Test
    public void testCanGraduateBadCredits() {
        System.out.println("canGraduate");
        StudentICE2 s = new StudentICE2("Krishna", 3.0, 119);
        boolean expResult = false;
        boolean result = s.canGraduate();
        assertEquals(expResult, result);
    }

    // BOUNDARY CASE: Both requirements matches exact by passing criteria
    @org.junit.jupiter.api.DisplayName("Graduation Eligibility — Boundary Case")
    @org.junit.jupiter.api.Test
    public void testCanGraduateBoundary() {
        System.out.println("canGraduate");
        StudentICE2 s = new StudentICE2("Krishna", 2.0, 120);
        boolean expResult = true;
        boolean result = s.canGraduate();
        assertEquals(expResult, result);
    }
    
//Nested Testing class
@Nested
@DisplayName("3 Additional near boundry cases for nested class testing")
class AdditionalBoundaryTests {

    @DisplayName("Nested BoundaryCase1: Honors TRUE while Graduate FALSE")
    @Test
    public void testHighGpaLowCredits() {
        System.out.println("additionalBoundaryTests");
        StudentICE2 s = new StudentICE2("Krishna", 3.9, 100);
        assertEquals(true, s.isEligibleForHonors());
        assertEquals(false, s.canGraduate());
    }

    @DisplayName("Nested BoundaryCase2: Not on probation but cannot graduate if credits < 120")
    @Test
    public void testGpaAt2CreditsBelow120() {
        System.out.println("additionalBoundaryTests");
        StudentICE2 s = new StudentICE2("Krishna", 2.0, 119);
        assertEquals(false, s.isOnProbation());
        assertEquals(false, s.canGraduate());
    }

    @DisplayName("Nested BoundaryCase3: GPA below honors and exactly 120 credits")
    @Test
    public void testGpaJustBelowHonorsAtFullCredits() {
        System.out.println("additionalBoundaryTests");
        StudentICE2 s = new StudentICE2("Krishna", 3.59, 120);
        assertEquals(false, s.isEligibleForHonors());
        assertEquals(true, s.canGraduate());
    }

}


}
