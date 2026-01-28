/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testexample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patel
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   
    /**
     * Test of checklength method, of class PasswordValidator.
     */
    @org.junit.jupiter.api.Test
    public void testChecklength() {
        System.out.println("checklength");
        String password = "";
        boolean expResult = false;
        boolean result = PasswordValidator.checklength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testChecklengthGood() {
        System.out.println("checklength");
        String password = "passwordabc";
        boolean expResult = true;
        boolean result = PasswordValidator.checklength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testChecklengthBad() {
        System.out.println("checklength");
        String password = "pass";
        boolean expResult = false;
        boolean result = PasswordValidator.checklength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testChecklengthBoundry() {
        System.out.println("checklength");
        String password = "password";
        boolean expResult = true;
        boolean result = PasswordValidator.checklength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckuppercase() {
        System.out.println("checkupper");
        String password = "";
        boolean expResult = false;
        boolean result = PasswordValidator.uppercase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckuppercaseGood() {
        System.out.println("checkupper");
        String password = "HenilPatel";
        boolean expResult = true;
        boolean result = PasswordValidator.uppercase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckuppercaseBad() {
        System.out.println("checkupper");
        String password = "password";
        boolean expResult = false;
        boolean result = PasswordValidator.uppercase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckuppercaseBoundry() {
        System.out.println("checkupper");
        String password = "Henil";
        boolean expResult = true;
        boolean result = PasswordValidator.uppercase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckspecial() {
        System.out.println("checkspecial");
        String password = "";
        boolean expResult = false;
        boolean result = PasswordValidator.hasSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @org.junit.jupiter.api.Test
    public void testCheckspecialGood() {
        System.out.println("checkspecial");
        String password = "Henil@#patel";
        boolean expResult = true;
        boolean result = PasswordValidator.hasSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @org.junit.jupiter.api.Test
    public void testCheckspecialBad() {
        System.out.println("checkspecial");
        String password = "Henil";
        boolean expResult = false;
        boolean result = PasswordValidator.hasSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @org.junit.jupiter.api.Test
    public void testCheckspecialBoundry() {
        System.out.println("checkspecial");
        String password = "Henil@patel";
        boolean expResult = true;
        boolean result = PasswordValidator.hasSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckperfectPassword() {
        System.out.println("checkperfect");
        String password = "";
        boolean expResult = false ;
        boolean result = PasswordValidator.isvalid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckperfectPasswordGood() {
        System.out.println("checkperfect");
        String password = "Kri@1908";
        boolean expResult = true ;
        boolean result = PasswordValidator.isvalid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckperfectPasswordBad() {
        System.out.println("checkperfect");
        String password = "pass";
        boolean expResult = false ;
        boolean result = PasswordValidator.isvalid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCheckperfectPasswordBoundry() {
        System.out.println("checkperfect");
        String password = "Kri@190806";
        boolean expResult = true ;
        boolean result = PasswordValidator.isvalid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
