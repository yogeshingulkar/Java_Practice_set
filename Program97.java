import java.util.Arrays;
import java.util.Scanner;

public class Program97 {

    // Convert month name to month number
    private static int getMonth(String month) {
        switch (month) {
            case "Jan": return 1;
            case "Feb": return 2;
            case "Mar": return 3;
            case "Apr": return 4;
            case "May": return 5;
            case "Jun": return 6;
            case "Jul": return 7;
            case "Aug": return 8;
            case "Sep": return 9;
            case "Oct": return 10;
            case "Nov": return 11;
            case "Dec": return 12;
        }
        return 0;
    }

    public static String[] sortDates(String[] dates) {

        Arrays.sort(dates, (d1, d2) -> {

            String[] a = d1.split(" ");
            String[] b = d2.split(" ");

            int day1 = Integer.parseInt(a[0]);
            int day2 = Integer.parseInt(b[0]);

            int month1 = getMonth(a[1]);
            int month2 = getMonth(b[1]);

            int year1 = Integer.parseInt(a[2]);
            int year2 = Integer.parseInt(b[2]);

            if (year1 != year2)
                return year1 - year2;

            if (month1 != month2)
                return month1 - month2;

            return day1 - day2;
        });

        return dates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] dates = new String[n];

        for (int i = 0; i < n; i++) {
            dates[i] = sc.nextLine();
        }

        String[] sortedDates = sortDates(dates);

        for (String date : sortedDates) {
            System.out.println(date);
        }
    }
}
