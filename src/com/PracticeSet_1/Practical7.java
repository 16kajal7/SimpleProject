package com.PracticeSet_1;

public class Practical7 {
    public static void main(String[] args) {
        
        //print below pattern
        //* 
        //**
        //***
        //****
        //***** 
        int n = 5;

        for(int row = 1; row <= n; row++) {
            //for every row run the column
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
           System.out.println();     
        } 
    }
    
}
