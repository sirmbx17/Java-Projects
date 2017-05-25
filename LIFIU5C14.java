/*************************************************************************************************
 * Sirak Berhane
 * #1485447
 * Get input for Cheese or Meat pizza.
 * Declare a single pizza to be used for both Cheese and Meat
 * If a Meat pizza is selected
 * instantiate your pizza as a LiFiPizza pizza with zero arguments
 * setType to Meat via the constructor
 * If a Cheese pizza is selected,Instantiate your pizza as a LiFiCheese pizza with zero arguments.
 * Output of your order varies based on Cheese or Meat (See Example)
****************************************************************************************************/

import java.util.Scanner;

import static java.lang.System.*;

public class LiFiUnit5Ch14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(in);
        String choice;    // user's entry

        out.print("\nWhat type of pizza would you like <Cheese or Meat>: ");// asks for user input
        choice = stdIn.nextLine();

        if (!choice.equalsIgnoreCase("meat")) {
            if (choice.equalsIgnoreCase("cheese")) {
                LiFiCheese cheese = new LiFiCheese();// sets the crust and price for cheese
                cheese.setCost();
                out.println();
                out.println(cheese);
            }
        } else {
            LiFiPizza meat = new LiFiPizza();// sets the crust and price for meat
            meat.setCrust();
            meat.setIngredient();
            meat.setCost();
            out.println();
            out.println(meat);
        }

    } // end main
}// end class