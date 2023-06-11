package com.StringsPractice;

import java.util.Scanner;

public class lowerCasetoUpperCase {
   public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in);

    System.out.print("Enter a String: "); 
    String inputString = scanner.nextLine();

    StringBuilder uppercaseString = new StringBuilder(); 

    /* the for loop initialized a loop variable 'i' with value 0.
       the loop will execute as long as i is less than the length of 'inputString'
    */
   for(int i = 0; i < inputString.length(); i++) {
        char c = inputString.charAt(i); //this line retrieve char at index 'i' from the 'inputString'
        // the current char is assigned to variable 'c'.

        //below line checks if the character 'c' is lowercase char by 
        // comparing the ASCII value of 'c' with ASCII value of lowercase letter
        // if char is lowercase if block will execute
        if(c >= 'a' && c <= 'z') {
            // Convert lowercase character to uppercase
            c = (char) (c-'a'+'A'); // this line converts char c to uppercase
        }
   
        uppercaseString.append(c); // this line appends char c to uppercaseString object
        } // append method is called to add the char at the end of the string
 System.out.println("Uppercase String: "+uppercaseString.toString());
  scanner.close();
    }
}
