/***********************************************************************************************************
 *  Sales object should store the sale in 2 integer instance variables, dollars and cents,
 *  and include a string variable to hold the error. This should be initialized with null.
 *  LiFiSaleCheck Constructor:
 *  Receive sale as a string
 *  Perform error checking to ensure time was entered in proper format to include
 *  a color (.) between the dollars and cents and a $ at the start of the string.
 *  Use indexOf and substring to separate the sale string into the appropriate instance variables
 *  Use try/catch to catch format errors of dollars and cents as shown in example
 *  If an error occurs, change the error instance variable to reflect the error (see sample)
 *  If more than one error occurs in the format of the dollars and cents, show both. print numeric method:
 *  Print in the format $123.45 using both dollars and cents instance variables
 *  Print in the format 123 dollars and 45 cents using both dollars and cents : instance variables
 *  print alphabetic method:
 *  Print in the format 123 dollars and 45 cents using both dollars and cents instance variables
 *  getError method: Include a getError method that returns the error instance variable to the print
 method.
**************************************************************************************************************/


import java.text.DecimalFormat;


public class LiFiSaleCheck {

    private int dollars;
    private int cents;
    private String error = null;

    LiFiSaleCheck(String sales) // constructor recieve sale as a  string
    {
        try // use try catch to capture bad format in input
        {
            if(sales.charAt(0)!='$')
                error = "Invalid sale format missing $ - " + sales;
            else if(sales.indexOf(".")==-1)  // Use indexOf and substring to separate the sale string
                error = "Invalid sale format missing . - " + sales;
            else
            {
                dollars=Integer.parseInt(sales.substring(1,sales.indexOf(".")));
            }
        }
        catch (Exception e)
        {
            error = "Invalid dollar format - For input string: \""+sales.substring(1,sales.indexOf("."))+"\"";
        }
        if(sales.indexOf(".")!=-1) //  Use indexOf and substring to separate the sale string
            try { // use try catch to capture  bad input
                cents = Integer.parseInt(sales.substring(sales.indexOf(".") + 1, sales.length()));
            } catch (Exception e) {
                if (error == null)
                    error = "Invalid cents format - For input string: \"" + sales.substring(sales.indexOf(".") + 1, sales.length()) + "\"";
                else {
                    error += "\nInvalid cents format - For input string: \"" + sales.substring(sales.indexOf(".") + 1, sales.length()) + "\"";
                }
            }
    }

    void printNumeric()
    {
        DecimalFormat df=new DecimalFormat("#.00");
        double total=dollars+cents/100.0;
        System.out.println("$"+df.format(total));
    }

    void printAlphaetic()
    {
        System.out.println(dollars+" dollars and "+cents+" cents.");
    }

    String getError() {
        return error;
    }// getError method that returns the error instance variable


} // end class
