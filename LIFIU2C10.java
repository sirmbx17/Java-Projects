/*******************************************************************
 * Sirak Berhane
 * ID# 1485447
 * LIFIU2C10.java
 * This program is similar to Unit 1 except it uses array lists.
 * Write a program that generates random number between 1 and 100,
 * then allows you to search for matching values.
 * Output is printed for a sorted and unsorted list.

 /********************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class LIFIU2C10 {
    private static ArrayList <Integer> RandomNumS;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many random numbers between 1 and 100: ");
        // prompts for user input
        int TotalNumsToBeGenerated = scanner.nextInt();
        RandomNumS = new ArrayList<>(); // create array of integers
        generateAndStoreRandomNumbers(TotalNumsToBeGenerated);
        //generate random numbers in an array

        System.out.print("Which random number are you searching for?: "); 
        // Prompts user for number to search
        int X = scanner.nextInt();
        // search in an unsorted array
        find(X, false);
        // search in a sorted array
        Collections.sort(RandomNumS);
        find(X, true);
        System.out.println("\nTotal of all numbers: " + getSum());

    }

    private static int getSum() {
        int sum = 0;
        for(int i : RandomNumS)
            switch (sum += i) {
            }
        return sum;
    }
    private static void generateAndStoreRandomNumbers(int nums) {
        Random rand = new Random();
        int randomNumber;
        for(int i = nums - 1; i >= 0; i--) {
            randomNumber = (rand.nextInt(100) % 100) + 1;
            RandomNumS.add(randomNumber);
        }
    }

    private static void find(int X, boolean isSorted) {
        int index = 0; //indexes for print location
        boolean HeaderPrinted = false;
        for(Object i : RandomNumS) {
            if ((int) i == X) {
                if(!HeaderPrinted) {
                    if (isSorted) System.out.println("\nSorted List");
                    else System.out.println("\nUnsorted List");
                    HeaderPrinted = true;
                }
                System.out.println(X + " found at location: " + index);
            }
            switch (index++) {
            }
        }
    }
} // End of class function
