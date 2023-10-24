import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for(int i=0; i<nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for(int i=0; i<nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai ke-" + (i) + " Lulus!");
            } else{
                System.out.println("Nilai ke-" + (i) + " Tidak Lulus!");
            }
    
        }
    }
}
