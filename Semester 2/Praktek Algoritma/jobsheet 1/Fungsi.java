import java.util.Scanner;

public class Fungsi {
     private static final int[][] STOCK = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };

    private static final String[] CABANG = {
        "RoyalGarden 1",
        "RoyalGarden 2",
        "RoyalGarden 3",
        "RoyalGarden 4",
    };

    private static final int[] HARGA = {
        75000, 50000, 60000, 10000
    };

    private static final int[] PENGURANGAN = {
        -1, -2, 0, -5
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pendapatan setiap cabang
        for (int i = 0; i < CABANG.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < STOCK[i].length; j++) {
                pendapatan += (STOCK[i][j] - PENGURANGAN[j]) * HARGA[j];
            }
            System.out.println("Pendapatan " + CABANG[i] + ": Rp" + pendapatan);
        }

        // Menampilkan stok setiap jenis bunga
        for (int i = 0; i < HARGA.length; i++) {
            int stokTotal = 0;
            for (int j = 0; j < STOCK.length; j++) {
                stokTotal += STOCK[j][i] - PENGURANGAN[i];
            }
            System.out.println("Stok " + getNamaBunga(i) + ": " + stokTotal);
        }
    }

    private static String getNamaBunga(int i) {
        switch (i) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
