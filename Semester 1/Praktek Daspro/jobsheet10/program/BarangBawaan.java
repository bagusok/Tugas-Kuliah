import java.util.Scanner;

public class BarangBawaan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Jumlah orang
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = scanner.nextInt();
        
        // Membuat array 2 dimensi untuk menyimpan data barang
        String[][] barangOrang = new String[jumlahOrang][2];
        
        // Memasukkan data barang untuk setiap orang
        for (int i = 0; i < jumlahOrang; i++) {
            System.out.println("Orang ke-" + (i + 1));
            
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan barang ke-" + (j + 1) + ": ");
                barangOrang[i][j] = scanner.next();
            }
        }
        
        // Menampilkan data barang untuk setiap orang
        System.out.println("Data Barang:");
        for (int i = 0; i < jumlahOrang; i++) {
            System.out.println("Orang ke-" + (i + 1) + ":");
            
            for (int j = 0; j < 2; j++) {
                System.out.println("Barang ke-" + (j + 1) + ": " + barangOrang[i][j]);
            }
            
            System.out.println();
        }
    }
}