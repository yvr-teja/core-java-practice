package basic.java.course.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExampleDateTimeFormatter
{
    public static void main(String[] args) {
    //DateTimeFormatter: Formats and parses dates and times.
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        String formattedDate= now.format(formatter);
        System.out.println(formattedDate);
    }
}
