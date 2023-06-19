package com.ArrayPractice;

// find the maximum element in an Array
public class MaximumElement {
    public static void main(String[] args) {
        int[] nums = {5,2,9,1,7};
        int max = findMaximum(nums);
        System.out.println("Maximum Element: "+max);
    }

    public static int findMaximum(int[] nums) {
        int max = nums[0];
        for(int i=0; i< nums.length; i++) {
            if(nums[i]>max)
                max=nums[i];
        }
        return max;
    }   
}
