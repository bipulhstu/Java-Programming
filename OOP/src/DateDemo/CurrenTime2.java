
package DateDemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class CurrenTime2 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println("Current Time is "+formattedTime);
    }
}
