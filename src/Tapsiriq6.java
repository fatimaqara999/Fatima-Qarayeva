import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        String metnEded = sc.next();

        int reqem = Integer.parseInt(metnEded);

        int netice = reqem + 5;
        System.out.println("Riyazi netice: " + netice);

        String neticeMetn = String.valueOf(netice);

        int uzunluq = neticeMetn.length();
        System.out.println("Netice metn kimi: " + neticeMetn);
        System.out.println("Uzunlugu: " + uzunluq);

        sc.close();
    }
}