public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */

    public static void main(String[] args) {
        int numOne = 12;
        int numTwo = 13;
        int numThree = 14;
        int numFour = 15;
        int amountNumbers = 4;

        double togetherNow = numOne + numTwo + numThree + numFour;
        double dividedAverage = togetherNow / amountNumbers;

        System.out.println("The average of the four numbers is " + dividedAverage);
    }
}
