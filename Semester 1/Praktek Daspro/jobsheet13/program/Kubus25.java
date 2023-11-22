import java.util.Scanner;

public class Kubus25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int s = sc.nextInt();

        hitungVolume(s);
        luasPermukaan(s);
    }

    static void hitungVolume(int s) {
        int vol = s * s * s;
        System.out.println("Volume kubus adalah " + vol);
    }

    static void luasPermukaan(int s) {
        int L = 6 * s * s;
        System.out.println("Luas permukaan kubus adalah " + L);
    }
}
