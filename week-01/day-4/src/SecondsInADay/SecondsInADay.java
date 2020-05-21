package SecondsInADay;

public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int currentTimeInSeconds = currentHours * 3600 + currentMinutes * 60 + currentSeconds;

        System.out.println("There are " + (24 * 3600 - currentTimeInSeconds) + " seconds left from the day.");
    }
}
