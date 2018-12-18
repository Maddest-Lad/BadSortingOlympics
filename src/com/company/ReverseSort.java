package com.company;

import java.util.Arrays;

public class ReverseSort {

    public static void sort(int[] nums) {

        //Sorting Properly First Time
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        //Start Recording Time
        long startTime = System.nanoTime();

        //Main Loop
        while(!Arrays.equals(nums,sorted)) {
            reverseBetween(randomNumber(nums.length+1), nums);

            //Debugging Print
            //for (int num : nums) System.out.print(num + ",");
            //System.out.println();
        }

        //Time Math
        long endTime = System.nanoTime();
        double timeElapsed = (endTime - startTime);
        double seconds = timeElapsed / 1_000_000_000.0;

        System.out.println(seconds);
        //System.out.println("It Took " + seconds + " Seconds to Sort an Array of " + (nums.length - 1) + " Values With ReverseSort");

    }

    private static void reverseBetween(int index, int[] nums) {
        for (int i = 0; i < index / 2; i++) {
            int tempswap = nums[i];
                nums[i] = nums[index - i - 1];
                nums[index - i - 1] = tempswap;
        }
    }

    private static int randomNumber(int max) {
        return (int) (Math.random() * ((max - 1) + 1));
    }
}
