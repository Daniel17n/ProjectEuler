import java.time.LocalDate;

public class Problem19 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(1900, 1, 1);
        LocalDate endDate = LocalDate.of(2000, 12, 31);
        int sundayCount = 0;
        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusMonths(1)) {
            if (date.getDayOfWeek().name().equals("SUNDAY") && date.getDayOfMonth() == 1) {
                sundayCount++;
                System.out.println(date + " " + date.getDayOfWeek());
            }
        }
        System.out.println("Number of Sundays that have been the first of the month: " + sundayCount);
    }
}
