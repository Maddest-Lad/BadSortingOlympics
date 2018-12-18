package com.company;


public class Main {

    public static void main(String[] args) {


        //Let The Sorting Begin
        System.out.println("\n"+"Swap Sort: ");
        for (int i = 0; i < 10; i++) {
            SwapSort.sort(Constants.nums.clone());
        }


        System.out.println("\n"+"Bogo Sort: ");
        for (int i = 0; i < 10; i++) {
            BogoSort.sort(Constants.nums.clone());
        }

          System.out.println("\n"+"Reverse Sort: ");
        for (int i = 0; i < 10; i++) {
            ReverseSort.sort(Constants.nums.clone());
        }

    }
}
