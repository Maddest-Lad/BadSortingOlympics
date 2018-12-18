package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SwapSort {

    public static void sort(@NotNull int[] nums) {

        //Sorting Properly First Time
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        //Start Recording Time
        long startTime = System.nanoTime();

        //Main Sorting Loop
        while(!Arrays.equals(nums, sorted)) {
            //Select 2 Random Indexes In the Array
            int indexOne = randomNumber(nums.length);
            int indexTwo = randomNumber(nums.length);

            //Separate the Values
            int valueOne = nums[indexOne];
            int valueTwo = nums[indexTwo];

            //Flip The Two Values
            nums[indexOne] = valueTwo;
            nums[indexTwo] = valueOne;

            //Debugging Print
            //for (int num : nums) System.out.print(num + ",");
            //System.out.println("");

        }

        //Time Math
        long endTime = System.nanoTime();
        double timeElapsed = (endTime - startTime);
        double seconds = timeElapsed / 1_000_000_000.0;

        System.out.println(seconds);
        //System.out.println("It Took "+seconds+" Seconds to Sort an Array of "+(nums.length-1)+" Values With SwapSort");
    }

    private static int randomNumber(int max) {
        return (int) (Math.random() * ((max - 1) + 1));
    }


}
