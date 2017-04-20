/******************************************************************************
 * Sirak Berhane
 *
 * ID#1485447
 *
 * Write a program that gets input for a string,
 * then output a substring of this string character by character showing the upper case,
 * lower case, initial case, binary, and hex values of each character.
 * Repeat until quit.
 ******************************************************************************/

import java.util.Scanner;

import static java.lang.System.*;

public class LIFIU3C12
{
    public static void main(String[] args)
    {

        Scanner scan;
        scan = new Scanner(in);
        String input;

        out.print("Please enter a string of any length: ");
        //  prompt for user input
        input = scan.nextLine();
        // takes user input

        int length;
        switch (input) {
            case "0":
                length = 0;
                break;
                // quits program for 0 string length
            default:
                length = input.length();
                break;

        }

        switch (length) {
            case 0:
                break;
                // quit program if string has 0 length
            default:
                out.printf("\n%-10s %-20s %-20s %-20s\n", "Initial", "ASCII<Char>", "ASCII<Int>", "Hex");
                break;
        }

        for(int i = length - 1; i >= 0; i--)
        {
            char initial;
            initial = input.charAt(i);

            out.printf("%-10s %-20s %-20s %-20s\n", initial, (Character.isDigit(initial))?"": (int) initial, (Character.isDigit(initial))? (int) initial :"", Integer.toHexString((int) initial).toUpperCase());
        } // displays the results

        out.println("\nThank you for playing!");


    }// end main function
} // end class function
