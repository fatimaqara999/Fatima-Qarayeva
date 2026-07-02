import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius derecesi (int): ");
        int c = sc.nextInt();

        double fYanlis = c * 9 / 5 + 32;
        double fDuzgun = c * 9.0 / 5 + 32;

        System.out.println("Yanlis variant (9/5):   " + fYanlis);
        System.out.println("Duzgun variant (9.0/5): " + fDuzgun);

        // FERQ: 9/5 = 1 (int bolme, kesr atilir), 9.0/5 = 1.8 (double bolme).
        // Ona gore de yanlis variant sehv netice verir, duzgun variant deqiqdi.

        sc.close();
    }
}