public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */
    public static void main(String[] args) {

        double milesPerHour = 125;
        double minutesTraveled = 45;

        double milesPerMinute = minutesTraveled / milesPerHour;
        double milesTraveled = milesPerHour * minutesTraveled;

        System.out.println("The miles per minute is " + milesPerMinute);
        System.out.println("You traveled " + milesTraveled + " miles!");
    }
}
