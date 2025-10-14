package basic.java.course.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
    //LocalDateTime: Represents a date and time without a time zone
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatedDateTime = now.format(formatter);
        System.out.println(formatedDateTime);
    }
}
