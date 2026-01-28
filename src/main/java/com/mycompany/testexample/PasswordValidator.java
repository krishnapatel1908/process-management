/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexample;

/**
 *
 * @author Krishna patel used git
 */
/**
 This method checks if the password length is greater than or equal to 8 characters. */
public class PasswordValidator {
        public static boolean checklength(String password){
        if(password.length()>=8){
            return true;
        }
        else{
            return false;
        }
    }
      //  This method checks if the password contains at least one uppercase letter.
       public static boolean uppercase(String password){
           for(char ch : password.toCharArray()){
               if(Character.isUpperCase(ch)){
                   return true;
               }
           }
           return false;
       } 
       
       //This method checks if the password contains at least one special character (non-alphanumeric).
       public static boolean hasSpecialCharacter(String password){
           for(char ch : password.toCharArray()){
               if(!Character.isLetterOrDigit(ch)){
                   return true;
               }
               
           }
           return false;
       }
       
       /**
        *  This method validates the password by checking if it meets the following criteria:
     * 1. Length is at least 8 characters.
     * 2. Contains at least one uppercase letter.
     * 3. Contains at least one special character. 
        */
       public static boolean isvalid(String password){
           if(password.length()<8){
               return false;
           }
           
           boolean hasupper = false;
           boolean hasspecialCharacter = false;
           
           for(char ch: password.toCharArray()){
               if(Character.isUpperCase(ch)){
                   hasupper = true;
               }
               if(!Character.isLetterOrDigit(ch)){
                   hasspecialCharacter = true;
               }
               if(hasupper && hasspecialCharacter){
                   return true;
               }
           }
           return false;
       }
}

