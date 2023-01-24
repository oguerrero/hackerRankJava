import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

public class DayName {
    public static void main(String[] args) throws IOException {
        int year = 2005;
        int month = 2;
        int day = 13;

        System.out.println(getDayName(year, month, day));
    }

    public static String getDayName(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}
