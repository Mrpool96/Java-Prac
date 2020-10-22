package Practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Addition_Program {
    public static void main(String[] args) {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date date = new Date();
        System.out.println(dateFormat.format(date));

        int a;
        int b;
        int result;

        System.out.println("Enter the First Number:-");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.println("Enter the Number:-");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();

        result = a + b ;

        System.out.println("The Addition of the Number " +a+ " and the Number " +b+ " is:- " +result);



    }
}
