package com.PracticeSet_1;
import java.util.Scanner;

public class Practical1 {
    public static void main(String args[]) {
        System.out.println("hello from Practical1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of "+num1+" & "+num2+" is:"+sum);
        
        scanner.close();
    }

}
