/*********************************************************************************************************
 * Sirak Berhane
 * #1485447
 * Driver class should loop until “q” is entered to quit
 * If enter is not “q”, then create an instance of the LiFiSaleCheck object passing the entry as an argument
 * If no error Print amount by calling:
 * print numeric from LiFiSaleCheck class
 * print alphabetic from LiFiSaleCheck class
 * If error Print error message (see sample)
**************************************************************************************************************/

import java.util.Scanner;

import static java.lang.System.*;

public class LiFiUnit6Ch15 {

    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(in);

        label:
        while (true) {
            out.print("Please enter amount of sale in form $#.## <\"q\" to quit> : "); // ask for user input
            String str = input.nextLine();
            switch (str) {
                case "q":  // quits program if user chooses q
                    break label;
                default:
                    LiFiSaleCheck obj;
                    obj = new LiFiSaleCheck(str);
                    if (obj.getError() != null) { //  if error occurs prints error message
                        out.println(obj.getError());
                    } else {
                        obj.printNumeric(); // numeric from Lifisalecheck
                        obj.printAlphaetic(); // alphabeteic from lifiSaleCheck
                    }
                    break;
            }
        }
    }  // end main
} // end class
