import java.util.Scanner;

public class Tapsiriq10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ad-Soyad: ");
        String adSoyad = sc.nextLine();

        System.out.print("Yash: ");
        int yas = sc.nextInt();
        sc.nextLine();

        System.out.print("Illik gelir (AZN): ");
        String gelirMetn = sc.nextLine();
        double gelir = Double.parseDouble(gelirMetn);

        boolean adDuzgun = adSoyad.contains(" ") && adSoyad.length() >= 5;
        boolean yasDuzgun = yas >= 18 && yas <= 70;
        boolean gelirDuzgun = gelir >= 3000;

        boolean qebul = adDuzgun && yasDuzgun && gelirDuzgun;

        System.out.println("===== SIGORTA MURACIETI =====");
        System.out.printf("Musteri: %s%n", adSoyad.toUpperCase());
        System.out.printf("Ad duzgun: %s%n", adDuzgun);
        System.out.printf("Yash duzgun: %s%n", yasDuzgun);
        System.out.printf("Gelir duzgun: %s%n", gelirDuzgun);
        System.out.printf("Gelir: %.2f AZN%n", gelir);
        System.out.printf("QERAR: %s%n", qebul);
        System.out.println("=============================");

        sc.close();
    }
}