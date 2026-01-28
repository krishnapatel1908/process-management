/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexample;

import java.util.Scanner;
/**
 * This class contains the main method to test the password validation functionality.
 * It takes a user input for a password and validates it using the methods defined in PasswordValidator class.
 * 
 * @author Krishna Patel
 */
public class TestExample {
    
    public static void main(String[] args){
        System.out.println("Enter a password:-");
        Scanner input=new Scanner(System.in);
        String password=input.nextLine();
        System.out.println("Is the password length valid:"+PasswordValidator.checklength(password));
        System.out.println("Is the password has valid uppercase:"+PasswordValidator.uppercase(password));
        System.out.println("Is the password has valid Spacial char:"+PasswordValidator.hasSpecialCharacter(password));
        System.out.println("Is the password perfectly valid:"+PasswordValidator.isvalid(password));
    }
}
