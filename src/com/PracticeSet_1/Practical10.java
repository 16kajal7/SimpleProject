package com.PracticeSet_1;

public class Practical10 {
    //print below pattern
    // ****
    // ***
    // **
    // *
    
    public static void main(String[] args) {
    int n = 5;
    
    for(int row = 1; row <= n ; row++) {
       // to achieve 4 star in column =4 in row =1 ,
       // what formula we need to acheive 4 with rows and n -> i.e. 5 -row +1 = n - row +1
        for(int col = 1; col <= n-row+1; col++) {
            System.out.print("* ");
            }
        System.out.println();
        }
    }
}
