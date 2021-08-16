public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   0.51 -> 2 quarters and 1 penny.
     */

    public static void main(String[] args) {
        double rawChange = 2.83;
        int  change = (int)(rawChange * 100.0);

        int numQuarters = change/25;
        change = change % 25;

        int numDimes = change/10;
        change = change % 10;

        int numNickels = change/5;

        int numPennies = change % 5;

        System.out.println("Coins needed to make $" + rawChange);
        System.out.println("Quarters: " + numQuarters);
        System.out.println("Dimes: " + numDimes);
        System.out.println("Nickels: " + numNickels);
        System.out.println("Pennies: " + numPennies);
    }

}
