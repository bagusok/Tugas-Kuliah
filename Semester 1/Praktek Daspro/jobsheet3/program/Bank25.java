import java.util.Scanner;

public class Bank25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.2, bunga, jml_tabungan_akhir;
        System.out.println("Masukkan jumlah tabungan awal anda: ");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("masukkan lama menabung anda: ");
        lama_menabung = sc.nextInt();
        bunga = jml_tabungan_awal * prosentase_bunga * lama_menabung;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: " + jml_tabungan_akhir);
    }
}
