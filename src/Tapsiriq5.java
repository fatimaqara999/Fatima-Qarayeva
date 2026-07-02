import java.util.Scanner;
public class Tapsiriq5 {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.print("Bir tam eded (int) daxil edin: ");
 int tamDeyer = sc.nextInt();
 double genishlenmis = tamDeyer;
 System.out.println("Widening neticesi: " + genishlenmis);
        System.out.print("Bir ondalik eded (double) daxil edin: ");
        double ondalikDeyer = sc.nextDouble();

        int daraldilmis = (int) ondalikDeyer;   // (int) LAZIMDIR! El ile cast
        System.out.println("Narrowing neticesi: " + daraldilmis);  // mes: 9.87 -> 9

        // ===== IZAH (tapsiriq bunu isteyir) =====
        // Narrowing-de ondalik hisse ITIR: (int) 9.87 = 9, 10 yox!
        // Java casting yuvarlamir, sadece ondalig KESIR (atir).

        // Scanner-i baglayiriq
        sc.close();
        // Narrowing-de ondaliq hisse itir: (int) 9.87 = 9, 10 yox!
        // Java casting yuvarlamir, sadece ondaligi kesir (atir).
    }

        }