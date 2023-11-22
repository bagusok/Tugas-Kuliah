import java.util.Scanner;

public class UcapanTerimaKasih25 {
    public static void main(String[] args) {
        ucapanTerimaKasih();
        ucapanTambahan("Ini Ucapan Tambahan");
    }

    public static String penerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void ucapanTerimaKasih() {

        String nama = penerimaUcapan();

        System.out.println("Thank you " + nama + " for being best teacher in the woorld. \n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything. \n");
        
    }

    public static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
}
