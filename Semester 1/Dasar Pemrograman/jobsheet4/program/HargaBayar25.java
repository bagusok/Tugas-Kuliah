import java.util.Scanner;

public class HargaBayar25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku : ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan harga buku : ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah buku : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah halaman : ");
        jmlHalaman = input.nextInt();
        System.out.println("Masukkan diskon : ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Diskon yang anda dapatkan : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar : " + bayar);

    }
}
