public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double gamePrice = 60.00;
        int steamDiscount = 20;

        double multiplyGame = steamDiscount * gamePrice;
        double discountAmount = multiplyGame / 100;

        System.out.println("Your total comes out to : " + discountAmount);
    }
}
