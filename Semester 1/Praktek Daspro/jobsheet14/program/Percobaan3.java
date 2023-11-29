import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo awal: ");
        double saldo = sc.nextDouble();
        System.out.print("Tahun: ");
        int tahun = sc.nextInt();

        System.out.print("Saldo akhir: " + tahun + " tahun = ");
        System.out.print(hitungLaba(saldo, tahun));
        
        sc.close();
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungLaba(saldo, tahun-1);
        }
    }
}
