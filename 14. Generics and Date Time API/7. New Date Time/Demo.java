import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Demo {
    public static void main(String[] args) {
        // LocalDate - Only date
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate: " + date);

        // LocalTime - Only time
        LocalTime time = LocalTime.now();
        System.out.println("LocalTime: " + time);

        // LocalDateTime - Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + dateTime);

        // ZonedDateTime - Date, Time, and Time Zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println("ZonedDateTime: " + zonedDateTime);
    }
}
