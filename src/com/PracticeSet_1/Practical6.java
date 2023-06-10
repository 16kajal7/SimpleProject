package com.PracticeSet_1;

//print right sided star pattern in java
public class Practical6 {
   public static void main(String[] args) {

    int i,j,rows=6;

    for(i=0; i<rows; i++) {
     for(j=0; j < rows-i-1; j++)
         {
            System.out.print(" "); //prints space between two stars
        }
        for(j=0; j<=i; j++) {
            System.out.print("*"); //prints star 
        }
        System.out.println(); 
        }
    }
}

