import java.util.Scanner;

public class TugasKelompok {
    public static void main(String[] args) {
        System.out.println("=== Menghitung Volume Tabung ===");
        
        Scanner sc = new Scanner(System.in);
        int jariJari, tinggi;
        double hasil;
        double phi = 3.14;

        System.out.print("Masukkan jari-jari: ");
        jariJari = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        hasil = phi * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung: " + hasil);

    }
}
