package com.ArrayPractice;

public class ArraySum {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        int sum = findSum(nums);
        System.out.println("Sum of Elements: "+sum);
    }
    
    public static int findSum(int[] nums) {
        int sum = 0;
        for(int i=0; i< nums.length; i++) {
            sum = sum + nums[i]; // sum += i;
        }
        return sum;
    }
}
