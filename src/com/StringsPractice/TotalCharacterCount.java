package com.StringsPractice;

// Java program to count the occurrence of a specific character in a given string\

public class TotalCharacterCount {
    public static void main(String[] args) {
        String str = "Hello World!";
        char target = 'o';
        int count = countOccurences(str, target);
        System.out.println("Character "+target+" occures "+count+" times.");
    }

    public static int countOccurences(String str, Character target) {
        int count =  0;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    
}
