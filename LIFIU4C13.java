/***************************************************************
* Sirak Berhane
 * ID#1485447
 * Instantiate an investor1 object using a two parameter constructor
 * passing the account number 1001 and the initial balance of $2,000
 * Instantiate an investor2 object using a two parameter constructor
 * passing the account number 2001 and the initial balance of $4,000
 *  Get input for interest rate (in the format .08 for 8%)
 * Use class variable to set interest rate
 * Output header as per sample showing interest rate
 * Print the table using a for loop displaying the current month and calling:
 * addInterest() to add the monthly interest for each iteration
 *getBalance() to display the current balance (See sample)
 *Output results for 15 months.
 *print the interest earned as shown in the sample for each investor
 *utilizing a printf statement. Don’t hard code the interest earned, or
 interest rate.
******************************************************************/


import java.util.Scanner;

import static java.lang.System.*;


class LIFIU4C13
{
    public static void main(String[] args)
    {
        LiFiUnit4Ch13Investor investor1; // investor1 Account
        investor1 = new LiFiUnit4Ch13Investor(1001, 2000);
        LiFiUnit4Ch13Investor investor2; // investor2 Account
        investor2 = new LiFiUnit4Ch13Investor(2001, 4000);

        Scanner scanner;
        scanner = new Scanner(in);
        out.print("Please enter the APR in the form of .05 for 5%: ");
        double interestRate; //Gets interest rate from user
        interestRate = scanner.nextDouble();

        LiFiUnit4Ch13Investor.setInteresetRate(interestRate); //Sets interest rate
        out.println("Monthly balances for one year with " + interestRate + " annual interest:\n");

        out.println("Month   Account #   Balance   Account #   Balance");
        out.println("-----   ---------   -------   ---------   -------");
        int X = 1;
        while (X <= 15) {
            investor1.addInterest();investor2.addInterest();
            out.printf("%5d%12d%10.2f%12d%10.2f\n", X, investor1.getACCOUNT_NUMBER(),
                    investor1.getBalance(), investor2.getACCOUNT_NUMBER(), investor2.getBalance());
            X++;
        }

        out.println();
        out.printf("Investor1 earned : %.2f interest in 15 months at %.2f%s\n", investor1.getBalance() - 2000, 100 * interestRate , "%"); // prints earning statement
        out.printf("Investor2 earned : %.2f interest in 15 months at %.2f%s\n", investor2.getBalance() - 4000, 100 * interestRate , "%");
    }
} //end of class
