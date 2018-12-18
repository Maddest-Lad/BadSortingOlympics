package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class BogoSort {

    public static void sort(@NotNull int[] nums) {

        //Start Recording Time
        long startTime = System.nanoTime();


        //Sorting Properly First Time
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        //Main Sorting Loop
        while (!Arrays.equals(nums, sorted)) {
            shuffle(nums);

            //Debugging Print
            //for (int num : nums) System.out.print(num + ",");
            //System.out.println();
        }

        //Time Math
        long endTime = System.nanoTime();
        double timeElapsed = (endTime - startTime);
        double seconds = timeElapsed / 1_000_000_000.0;

        System.out.println(seconds);
        //System.out.println("It Took " + seconds + " Seconds to Sort an Array of " + (nums.length - 1) + " Values With BogoSort");
    }

    private static void shuffle(@NotNull int[] nums) {
		for(int i = 0; i < nums.length; ++i) {
			int index1 = (int) (Math.random() * nums.length),
				index2 = (int) (Math.random() * nums.length);
			int a = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = a;
		}
	}
}