import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir ondalig eded daxil edin: ");
        double deyer = sc.nextDouble();

        int castNetice = (int) deyer;
        long roundNetice = Math.round(deyer);

        System.out.println("(int) casting neticesi:  " + castNetice);
        System.out.println("Math.round() neticesi:   " + roundNetice);

        sc.close();
    }
}