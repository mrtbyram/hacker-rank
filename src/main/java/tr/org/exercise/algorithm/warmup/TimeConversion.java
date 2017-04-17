package tr.org.exercise.algorithm.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by muratbayram on 17/04/2017.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssaa");
        Date d = new Date();
        try {
            d = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(d));

        String aa = time.substring(8);
        time = time.substring(0,8);
        int hour = Integer.parseInt(time.split(":")[0]);
        if("PM".equals(aa)) hour += 12;
        System.out.println(hour+time.substring(2));
    }
}
