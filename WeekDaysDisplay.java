import java.time.DayOfWeek;

public class WeekDaysDisplay {

    public static void main(String[] args
        // Display weekdays (Monday to Friday)
        System.out.println("The weekdays are:");
        
        // Loop through the days of the week starting from Monday
        for (DayOfWeek day : DayOfWeek.values()) {
            // We can skip Saturday and Sunday
            if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                System.out.println(day);
            }
        }
    }
}
