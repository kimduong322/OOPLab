import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class days_in_a_month {

    // Get month number from month string
    static int get_month_number(String sMonth) {

        // Remove dots from abbreviation "Jan." -> "Jan"
        if (sMonth.charAt(sMonth.length() - 1) == '.') {
            sMonth = sMonth.substring(0, sMonth.length() - 1);
        }

        // Loop every type of format
        DateTimeFormatter numMonth = DateTimeFormatter.ofPattern("M");
        DateTimeFormatter abbMonth = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter fullMonth = DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter formatterArray[] = { numMonth, abbMonth, fullMonth };

        for (DateTimeFormatter dtFormatter : formatterArray) {
            try {
                return dtFormatter.parse(sMonth).get(ChronoField.MONTH_OF_YEAR);
            } catch (Exception ignore) {
            }
        }
        // No return -> invalid input
        throw new IllegalArgumentException("Invalid month input!");
    }

    // Get number of days from number of month and year
    static int day_from_month(int iMonth, int iYear) {
        YearMonth oYearMonth = YearMonth.of(iYear, iMonth);
        return oYearMonth.lengthOfMonth();
    }

    public static void main(String[] args) throws Exception {

        Scanner oScanner = new Scanner(System.in);
        System.out.print("Month: ");
        String sMonth = oScanner.nextLine();
        System.out.print("Year: ");
        int iYear = oScanner.nextInt();
        oScanner.close();

        System.out.format("Number of days: %d", day_from_month(get_month_number(sMonth), iYear));
    }
}
