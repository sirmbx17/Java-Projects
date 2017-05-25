/************************************************************************
 *  Set the type to cheese via the constructor body.
 *  setCrust() – (notice this is different from LiFiPizza setCurst method)
 *  Automatically set it to “Thin” crust, no option to change, sorry
**************************************************************************/


import static java.lang.String.*;

public class LiFiCheese extends LiFiPizza {

    LiFiCheese() {
        this.type = "Cheese";
        this.crust = "Thin"; // crust set to  be thin always
    }


    // prints by overriding the default format of the "toString" method
        public String toString() {
        double cost = 5;  // set cost of crust
        return
                format("You ordered:\n%s pizza\n%s crust\nTotal cost of $%s", this.type, crust, format("%.2f", cost));
    }

}