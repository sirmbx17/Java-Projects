/***********************************************************************
 * Sirak Berhane
 * ID# 1485447
 * All variables should be declared private.
 * Declare a class variable called interestRate (This will hold the annual
   interest rate)
 * Provide a class method that will be used to set the annual interest rate
 * Provide a two parameter constructor to initialize the constant account
  number and balance.
 * Provide an addInterest() method to update the balance based on the
 * interestRate entered in the driver.
 * Add the interest using (balance * interestRate / 12)
 * Declare a constant called ACCOUNT_NUMBER
 * Declare an instance variable called balance

*************************************************************************/

public class LIFIU4C13I extends LIFIU4C13
{

    private static double interestRate;
    private double balance; // instance declared
    private final int ACCOUNT_NUMBER; // constant declared

    LiFiUnit4Ch13Investor(int ACCOUNT_NUMBER, double balance)
    {
        switch (this.ACCOUNT_NUMBER = ACCOUNT_NUMBER) {
        }
        this.balance = balance;
    }

    static void setInteresetRate(double inRate)
    {
        interestRate = inRate; // interest rate
    }

    void addInterest()
    {
        this.balance = this.balance + ((this.balance * interestRate) / 12); //  update the balance based on driver
    }

    double getBalance()
    {
        return this.balance; // return balance
    }

    int getACCOUNT_NUMBER()
    {
        return this.ACCOUNT_NUMBER;
    }

}// end of class
