import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: ");
        String email = sc.next();

        boolean atVar = email.contains("@");
        boolean noqteVar = email.contains(".");
        boolean atdanEvvel2 = email.indexOf("@") >= 2;

        System.out.println("@ var:                " + atVar);
        System.out.println(". var:                " + noqteVar);
        System.out.println("@-den evvel 2+ simvol: " + atdanEvvel2);

        sc.close();
    }
}