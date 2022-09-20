package main;

public class TimeFormatter {

    static final long secXmin = 60;
    static final long secXhour = 60 * 60;
    static final long secXday = 3600 * 24;
    //31.540.000.000
    static final long secXyear = 525600 * 60;

    public static String formatDuration(long seconds) {

        if (seconds == 0) {
            return "now";
        }
        // your code goes here
        long secondsTotal = seconds;
        long secondsOriginal = seconds;

        String cadena = "";
        String yearString = "";
        String dayString = "";
        String hourString = "";
        String minString = "";
        String secString = "";

        String[] duration = new String[5];

        if (secondsTotal >= secXyear) {
            //Segundos con resto 0
            long year = secondsTotal / secXyear;
            secondsTotal = secondsTotal - (year * secXyear);

            yearString += year + " year";
            if (year != 1) {
                yearString += "s";
            }
        }

        if (secondsTotal >= secXday) {
            //Segundos con resto 0

            long day = secondsTotal / secXday;
            secondsTotal = secondsTotal - (day * secXday);
            dayString += day + " day";
            if (day != 1) {
                dayString += "s";
            }
        }

        if (secondsTotal >= secXhour) {
            //Segundos con resto 0

            long hour = secondsTotal / secXhour;
            secondsTotal = secondsTotal - (hour * secXhour);
            hourString += hour + " hour";
            if (hour != 1) {
                hourString += "s";
            }
        }

        if (secondsTotal >= secXmin) {
            //Segundos con resto 0

            long minute = secondsTotal / secXmin;
            secondsTotal = secondsTotal - (minute * secXmin);
            minString += minute + " minute";
            if (minute != 1) {
                minString += "s";
            }
        }

        if (secondsTotal >= 1) {
            //Segundos con resto 0
            secString += secondsTotal + " second";
            if (secondsTotal != 1) {
                secString += "s";
            }
        }

        duration[0] = yearString;
        duration[1] = dayString;
        duration[2] = hourString;
        duration[3] = minString;
        duration[4] = secString;

        int cont = 0;

        for (int i = 0; i < duration.length; i++) {
            if (!(duration[i].equalsIgnoreCase(""))) {
                cont++;
            }
        }

        for (int i = 0; i < duration.length; i++) {

            if (cont == 2) {
                if (!(duration[i].equalsIgnoreCase(""))) {
                    duration[i] += " and ";
                    return duration[0] + duration[1] + duration[2] + duration[3] + duration[4];
                }
            }
            if (cont > 2) {
                if (!(duration[i].equalsIgnoreCase(""))) {
                    duration[i] += ", ";
                    cont--;
                }
            }
        }

        cadena = duration[0] + duration[1] + duration[2] + duration[3] + duration[4];
        return cadena;
    }

    public static void main(String args[]) {
        System.out.println(formatDuration((765410)));
    }

}