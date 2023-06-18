package com.StringsPractice;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = checkAnagram(str1,str2);

        if(isAnagram) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        // Convert the Strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the length of the strings are different
        if(str1.length() != str2.length()) {
            return false;
        }

        // Convert the Strings to Char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //Sort the char arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted Array
        return Arrays.equals(arr1,arr2);
    }
    
}
