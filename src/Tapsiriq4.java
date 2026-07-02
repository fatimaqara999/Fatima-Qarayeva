import java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci eded (a) ");
        int a = sc.nextInt();

        System.out.print("Ikinci eded (b) ");
        int b = sc.nextInt();

        System.out.println("Evvel: a=" + a + ", b=" +b);
         //Riyazi addimlar

        a = a + b;   // a indi cemi saxlayir. Mes: 15+40 = 55
        b = a - b;   // b indi kohne a-ni alir. Mes: 55-40 = 15
        a = a - b;   // a indi kohne b-ni alir. Mes: 55-15 = 40

        System.out.println("Sonra: a=" + a + ", b=" + b);
        sc.close();

    }



}
