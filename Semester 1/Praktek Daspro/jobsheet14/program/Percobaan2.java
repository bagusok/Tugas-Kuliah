import java.util.Scanner;

public class Percobaan2 {


    static String ctk = "";

    public static void main(String[] args) {
        int bilangan, pangkat;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
        System.out.println(ctk + "1 = " + hitungPangkat(bilangan, pangkat));

        sc.close();
    }

    static int hitungPangkat(int x, int y) {

        if (y == 0) {
            return 1;
        } else {
             ctk += x + " x ";
            return x * hitungPangkat(x, y-1);
        }
    }





}
