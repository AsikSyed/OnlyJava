package funcArray;

import java.text.SimpleDateFormat;
import java.util.Date;

public class practice {
    public static void main(String[] args) {
        System.out.println("");

        Date bday= new Date();
        System.out.println(bday);

        long timestamp= bday.getTime();
        System.out.println(timestamp);
        SimpleDateFormat formatter= new SimpleDateFormat(" dd-MM-yyyy");
        String today= formatter.format(timestamp);
        System.out.println(today);
    }
}
