package CodingHours;

public class CodingHours {
    public static void main(String[] args) {
        int dailyCodingHours = 6;
        int weeklyCodingHours = 5 * dailyCodingHours;
        int courseLengthWeeks = 17;

        int totalCodingHours = weeklyCodingHours * courseLengthWeeks;
        System.out.println(totalCodingHours + " hours");

        int avgWeekHours = 52;
        float codingPercentage = 100 * (float) weeklyCodingHours/avgWeekHours;
        System.out.println(codingPercentage + "%");
    }
}
