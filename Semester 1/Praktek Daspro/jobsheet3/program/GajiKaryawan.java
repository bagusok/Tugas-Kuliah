import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Hitung Gaji Karyawan =====");

        double bonus, gajiPerJam = 20000;
        int jumlahJam;
        String namaKaryawan;

        System.out.print("Masukkan nama karyawan: ");
        namaKaryawan = sc.nextLine();
        System.out.print("Masukkan jumlah jam kerja: ");
        jumlahJam = sc.nextInt();
        System.out.print("Masukkan Bonus  dalam rupiah (isi 0 jika tidak ada): ");
        bonus = sc.nextInt();

        System.out.println("=================================");

        double gajiTotal = jumlahJam * gajiPerJam + bonus;
        System.out.println("\nNama karyawan: " + namaKaryawan);
        System.out.println("Gaji per jam: Rp. " + gajiPerJam);
        System.out.println("Jumlah jam kerja: " + jumlahJam);
        System.out.println("Bonus: Rp. " + bonus);
        System.out.println("Gaji total: Rp. " + gajiTotal + "\n");

    }
    
}
