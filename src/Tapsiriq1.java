import java.util.Scanner;
public class Tapsiriq1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci eded: ");
        int a = sc.nextInt();

        System.out.print("Ikinci eded: ");
        int b = sc.nextInt();


        int toplama = a+b;
        int cixma = a-b;
        int vurma = a*b;
        int bolme = a/b;
        int qaliq = a%b;

        System.out.println("Toplama: " + toplama);
        System.out.println("Cixma: " + cixma);
        System.out.println("Vurma: " + vurma);
        System.out.println("Bolme: " + bolme);
        System.out.println("Qaliq:" + qaliq);

 // Int kesirleri silir, kesrle yazmaq istesek double-la yazmali idik ona gore bolme neticesini istediyimiz kimi ala bilmerik.


    }
}