package com.StringsPractice;
//  Java program to check if a given string is a palindrome or not
public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = isPalindrome(str);
        if(isPalindrome) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
