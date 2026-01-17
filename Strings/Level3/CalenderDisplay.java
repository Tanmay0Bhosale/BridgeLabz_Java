package Strings.Level3;

// Class to display a monthly calendar
public class CalenderDisplay {

    // Method to check whether a given year is a leap year
    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Method to calculate the day of the week for a given date
    static int firstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        // Month and year for which calendar is displayed
        int month = 7, year = 2005;

        // Array storing number of days in each month
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Adjust February days if leap year
        if (month == 2 && isLeap(year)) days[1] = 29;

        // Print calendar header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Find the starting day of the month
        int start = firstDay(1, month, year);

        // Print initial spacing before first date
        for (int i = 0; i < start; i++)
            System.out.print("    ");

        // Loop to print all days of the month
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%3d ", i);

            // Move to next line after Saturday
            if ((i + start) % 7 == 0)
                System.out.println();
        }
    }
}
