package com.PracticeSet_1;

public class Practical8 {
    // print below pattern
    //1
    //12
    //123
    //1234
    //12345
    //123456
    public static void main(String[] args) {
        
        int n = 6;

        for(int row=1; row <= n; row++) {
            for(int col=1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
