import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // java.util.Date - Current Date and Time
        Date date = new Date();
        System.out.println("Current Date (java.util.Date): " + date);

        // Getting milliseconds since epoch
        long time = date.getTime();
        System.out.println("Milliseconds since epoch: " + time);

        // Converting to java.sql.Date for database operations
        java.sql.Date sqlDate = new java.sql.Date(time);
        System.out.println("SQL Date (java.sql.Date): " + sqlDate);
    }
}
