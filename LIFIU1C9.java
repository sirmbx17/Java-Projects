/**************************************************************************************
 * Sirak Berhane
 * Student ID: 1485447
 * LIFIU1C9.java
 * This program gets, creates, sorts, prints and searches an array of random numbers
*************************************************************************************/

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class LIFIU1C9 { // start class function

    public static void main(String[] args) {  //  start main function

        int[] unsortedArray; // unsorted array
        unsortedArray = new int[10];
        int[] sortedArray; // sorted array
        sortedArray = new int[10];
        Random number = new Random(); // generates random number




        for(int i = 9; i >= 0; i--)
        {
            switch (unsortedArray[i] = number.nextInt(20) + 1) {
            }
        }


        System.arraycopy(unsortedArray, 0, sortedArray, 0, 10);

        Arrays.sort(sortedArray); // sort via java API

        System.out.println("Unsorted Array\tSorted Array");


        for(int i = 9; i >= 0; i--)
        {
            System.out.println(unsortedArray[i] + "\t" + "\t" + sortedArray[i]);
        }

        System.out.print("\nPlease enter a number to search for: ");
        Scanner scan = new Scanner(System.in); // takes input
        int num = scan.nextInt();
        int location1 = -1;



        for(int i = 9; i >= 0; i--){
            if (unsortedArray[i] != num) {
            } else {
                switch (location1 = i) {
                }
                System.out.println("\nSearch Value: " + num + " is found at location: " + (location1 + 1) +" in the unsorted array");
            }

            if (sortedArray[i] != num) {
                continue;
            }
            switch (location1 = i) {
            }
            System.out.println("\nSearch Value: " + num + " is found at location: " + (location1 + 1) + " in the sorted array");
        }


        switch (location1) {
            case -1:
                System.out.println("\nSearch Value: " + num + " was not found");
                break;
        }



    } //end main function

} //end class function