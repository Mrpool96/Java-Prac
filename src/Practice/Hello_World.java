package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello_World {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

        System.out.println("Welcome to the Java Practice");

    }
}
