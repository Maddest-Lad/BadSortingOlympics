package com.company;

import java.util.Arrays;

public class Constants {
        public static final int[] nums = unSorted(11);

        private static int[] unSorted(int max) {

        //Generate Random Array "nums"
        int[] nums = new int[max];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = randomNumber();
        }

        /*
        //Print The Arrays For Reference
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if(i<nums.length-1) {System.out.print(", ");}
        }


        //Print Sorted Array For Understanding
        System.out.print(" -> ");

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            if(i<nums.length-1) {System.out.print(", ");}
        }

        System.out.println("\n");
        */
        return nums;
    }

    private static int randomNumber() {
        return (int) (Math.random() * ((100 - 1) + 1)) + 1;
    }
}
