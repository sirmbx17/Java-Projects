/**************************************************************
 * default constructor should set pizzaType to Meat and cost to $5
 * setCrust()
 * Call setCrust and allow selection of Thin or Thick crust
 * setIngredients() and allow for only 1 ingredient
 * setCost() add $2 to the initial cost which is $5
 * include accessor methods as needed.
 * Ensure all instance variables are private
******************************************************************/

import java.util.Scanner;

//public abstract class LiFiPizza
public class LiFiPizza
{
    public String type;
    public String crust;
    private Scanner stdIn = new Scanner(System.in);
    private String ingredient;

    private String getType()
    {
        this.type = "Meat";
        return type;
    } // end getType

    private String getCrust()
    {
        return crust;
    } // end getCrust

    Double setCost()
    {
        return (double) 7;
    }// end setCost

    // get user input
    void setIngredient()
    {
        System.out.print("What ingredient, sorry, only one: ");
        ingredient = stdIn.nextLine();
    } // end setIngredient


    // get user input
    void setCrust()
    {
        System.out.print("Thin or Thick crust: ");
        crust = stdIn.nextLine();
    } // end setCrust

    // displays summary by overriding default format of the "toString" method
    public String toString()
    {
        return
                String.format("You ordered:\n%s pizza\n%s <+ $2.00>\n%s crust\nTotal cost of $%s", getType(), ingredient, getCrust(), String.format("%.2f", setCost()));
    }



} //end class




