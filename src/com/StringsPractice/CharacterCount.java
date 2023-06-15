package com.StringsPractice;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();  // take the input until nextLine or string ends.

        String stringWithoutSpaces = inputString.replaceAll("\\s+","");
        
        int characterCount = stringWithoutSpaces.length();  // store the input in 'inputString' until the string length.

        System.out.println("Number of Characters: "+ characterCount);

        scanner.close();
    }  
}
