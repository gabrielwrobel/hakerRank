import java.time.LocalDate;

public class DayFinder {

    public static String findDay(int month, int day, int year) {
        if(isYearValidate(year)) {
            LocalDate date = LocalDate.of(year, month, day);
            return date.getDayOfWeek().toString();
        } return "0";
    }

    private static boolean isYearValidate(int year) {
        return year > 2000 && year < 3000;
    }
}