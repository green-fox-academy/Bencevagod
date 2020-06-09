package Reservations;

import java.util.Random;

public class Reservation implements Reservationy{

    private String DOWBooking;
    private String codeBooking;

    public Reservation() {
        this.codeBooking = "";
        this.DOWBooking = "";
    }

    public String getDOWBooking() {
        return this.DOWBooking;
    }

    public String getCodeBooking() {
        return this.codeBooking;
    }

    @Override
    public void setDOWBooking() {
        Random r = new Random();
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        this.DOWBooking = days[r.nextInt(days.length)];
    }

    @Override
    public void setCodeBooking() {
        char[] base = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
                'W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        StringBuilder string = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            string.append(base[r.nextInt(1000)%base.length]);
        }
        this.codeBooking = string.toString();
    }

    public void formatReservation() {
        this.setCodeBooking();
        this.setDOWBooking();
    }

    public void printReservation() {
        this.formatReservation();
        System.out.println("Booking# "+this.getCodeBooking()+" for "+this.getDOWBooking());
    }
}
