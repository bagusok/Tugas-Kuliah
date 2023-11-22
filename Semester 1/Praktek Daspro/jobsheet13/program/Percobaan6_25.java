import java.util.Scanner;

public class Percobaan6_25 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int p, l, t, L, vol;

        // System.out.println("Masukkan panjang");
        // p = input.nextInt();

        // System.out.println("Masukkan lebar");
        // l = input.nextInt();

        // System.out.println("Masukkan tinggi");
        // t = input.nextInt();

        // L = p * l;
        // System.out.println("Luas Persegi panjang adalah " + L);

        // vol = p * l * t;
        // System.out.println("Volume balok adalah " + vol);

        // input.close();

        int temp = jumlah(1, 1);
        tampilJumlah(temp, 5);
    }

    public static void tampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }

    public static int jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void tampilJumlah(int bil1, int bil2) {
        tampilHinggaKei(jumlah(bil1, bil2));
    }


}
