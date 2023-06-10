package com.PracticeSet_1;

public class Practical4 {
    

public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i< n-1; i++) {
        for(int j = 0; j < n -i-1; j++) {
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }    
}
public static void main(String[] args) {
    int[] arr = {5,2,8,12,1,6,3};
    System.out.println("Array before sorting: ");
        for(int num : arr) {
        System.out.print(num + " ");
        }

        bubbleSort(arr); //calling bubbleSort method

        System.out.println("\nArray after sorting: ");
        for(int num : arr) {
        System.out.print(num + " ");
        }
    }
}