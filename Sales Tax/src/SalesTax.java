public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

    public static void main(String[] args) {

        //declare and initialize variables
        int quantity = 6;
        double price = 9.99;
        final double TAX = 7.0; //0.07
        final double TAXRATE = TAX/100;

        //calculations
        double subTotal = price * quantity;

        //DISCOUNTS AND INCREASES
        /*
            FORMULA: AMOUNT * (1 +/- RATE)
            COST INCREASE USE +
            COst DECREASE USE -
         */

        double tax = subTotal * TAXRATE;
        double totalCost = subTotal * (1 + TAXRATE);

        System.out.println("You bought " + quantity + " shirt at " + price + " a piece");
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + totalCost);
    }
}
