package com.PracticeSet_1;

import java.net.PortUnreachableException;

public class Practical9 {

//print below pattern
// *******
// *******
// *******
// *******
// *******
// ******* 
    
public static void main(String[] args) {

    int n = 6;

   // identify the number of rows
    for(int row = 1; row <= n; row++) {
        // identify col in every row i.e. in every row col are also = n; so col<=n
        for(int col =1; col <= n ; col++) {
            // what are we printing '*'
            System.out.print("*");
        }
        // to move to next line println
        System.out.println();
    }
}
}
