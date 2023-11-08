import java.util.Scanner;

public class ArrayRata25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jml = sc.nextInt();

        int[] nilaiMhs = new int[jml];
        int lulus = 0;
        double sumLulus = 0;
        double sumTidakLulus = 0;

        for(int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus++;
                sumLulus += nilaiMhs[i];
            }else{
                sumTidakLulus += nilaiMhs[i];
            }
        }


        double rataLulus = sumLulus / lulus;
        double rataTidakLulus = sumTidakLulus / (nilaiMhs.length - lulus);

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

    
        sc.close();
    }
}
