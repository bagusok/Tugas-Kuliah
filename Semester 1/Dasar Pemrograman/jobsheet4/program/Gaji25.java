import java.util.Scanner;

class Gaji25{
    public static void main(String[] args) {
        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah masuk : ");
        jmlMasuk = scanner.nextInt();
        System.out.println("Masukkan jumlah tidak masuk : ");
        jmlTdkMasuk = scanner.nextInt();
        System.out.println("Masukkan gaji : ");
        gaji = scanner.nextInt();
        System.out.println("Masukkan potongan gaji : ");
        potGaji = scanner.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

        System.out.println("Total gaji : " + totGaji);
    }
}