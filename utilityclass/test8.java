package utilityclass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;


public class test8 {
    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);


    }
}
