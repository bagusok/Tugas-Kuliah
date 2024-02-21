import java.util.Scanner;

public class Kecepatan {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

        scanner.close();
    }


    private static void hitungKecepatan() {
        System.out.print("Masukkan jarak tempuh (km) : ");
        int jarak = scanner.nextInt();
        System.out.print("Masukkan waktu tempuh (jam) : ");
        int waktu = scanner.nextInt();
        int kecepatan = jarak / waktu;
        System.out.println("Kecepatan rata-rata : " + kecepatan + " km/jam");
    }

    private static void hitungJarak() {
        System.out.print("Masukkan kecepatan (km/jam) : ");
        int kecepatan = scanner.nextInt();
        System.out.print("Masukkan waktu tempuh (jam) : ");
        int waktu = scanner.nextInt();
        int jarak = kecepatan * waktu;
        System.out.println("Jarak tempuh : " + jarak + " km");
    }

    private static void hitungWaktu() {
        System.out.print("Masukkan jarak tempuh (km) : ");
        int jarak = scanner.nextInt();
        System.out.print("Masukkan kecepatan (km/jam) : ");
        int kecepatan = scanner.nextInt();
        int waktu = jarak / kecepatan;
        System.out.println("Waktu tempuh : " + waktu + " jam");
    }
    

    private static void menu() {
        System.out.println("1. Hitung kecepatan");
        System.out.println("2. Hitung jarak");
        System.out.println("3. Hitung waktu");
        System.out.print("Pilih menu : ");
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }
}
