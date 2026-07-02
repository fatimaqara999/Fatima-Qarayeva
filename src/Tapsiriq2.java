import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kredit meblegi ");
        double mebleg = sc.nextDouble();

        System.out.print("Illik faizi ");
        double faiz = sc.nextDouble();

        System.out.print("Muddet (ay): ");
        double muddet = sc.nextDouble();

        double umumiFaiz = mebleg * (faiz/100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis/muddet;

        // Hesabat kimi cap

        System.out.println("==========Kredit Hesabati==========");
        System.out.println("Umumi faiz: " + umumiFaiz + " AZN");
        System.out.println("Umumi odenis: " + umumiOdenis + " AZN");
        System.out.println("Ayliq odenis: " + ayliqOdenis  + " AZN");
        System.out.println("=================");
sc.close();





    }
}


