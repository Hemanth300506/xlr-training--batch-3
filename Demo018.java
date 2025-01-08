public class Demo018 {
    public static void main(String[] args) {
        long minutes = 1746389;
        long minutesInYear = 60 * 24 * 365;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;

        long minutesInDay = 60 * 24;
        long remainingDays = remainingMinutes / minutesInDay;
        remainingMinutes = remainingMinutes % minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years, " + remainingDays + " days, and " + remainingMinutes + " minutes.");
    }
}

