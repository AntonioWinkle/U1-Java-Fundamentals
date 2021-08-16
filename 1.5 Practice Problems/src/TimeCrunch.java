public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int initialSeconds = 5600;

        System.out.print(initialSeconds);

        int numHours = initialSeconds / 3600;
        initialSeconds = initialSeconds % 3600;

        int numMinutes = initialSeconds / 60;

        int numSeconds = initialSeconds % 60;

        System.out.println(" seconds would be about " + numHours + " hours, " + numMinutes + " minutes, and " + numSeconds + " seconds in time.");
    }
}
