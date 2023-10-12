import java.util.Scanner;

class KelHitungPenjumlahan{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.print("Anda ingin menjumlahkan berapa angka? : ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            int angka = sc.nextInt();
            total += angka;
        }

        System.out.println("Total penjumlahan : " + total);

        sc.close();
    }
}