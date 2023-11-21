import java.util.Scanner;

class NilaiMatkul{
    static String[] nama = new String[5];
    static int[][] nilai = new int[5][7];

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inputNilai();
        System.out.println("=====================================");
        tampilNilai();
        int[] index = cariNilaiTertinggi();
        mhsTertinggi(index[0], index[1]);
    }

    static void inputNilai() {
        for (int i = 0; i<5; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama Mahasiswa: ");
            nama[i] = sc.next();
            for (int j = 0; j<7; j++) {
                System.out.print("Masukkan nilai ke-" + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
            }

            System.out.println();

        }
    }

    static void tampilNilai(){
        for (int i = 0; i<5; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + nama[i]);
            for (int j = 0; j<5; j++) {
                System.out.println("Nilai minggu ke-" + (j+1) + ": " + nilai[i][j]);
            }

            System.out.println();

        }
    }

    static int[] cariNilaiTertinggi() {

        int indexNamaMinggu[] = {0, 0};

        int i = 0;
        for (int nils[]: nilai) {
            int j = 0;
           for (int nil: nils) {
                if (nil > nilai[indexNamaMinggu[0]][indexNamaMinggu[1]]) {
                     indexNamaMinggu[0] = i;
                     indexNamaMinggu[1] = j;
                }
                j++;
           }
              i++;
        }

        System.out.println("Nilai tertinggi pada minggu ke " + (indexNamaMinggu[1]+1) + " adalah " + nilai[indexNamaMinggu[0]][indexNamaMinggu[1]]);

        return indexNamaMinggu;
    }

    static void mhsTertinggi(int indexNama, int indexMinggu) {
         System.out.println("Nilai tertinggi " + nama[indexNama] + " pada minggu ke-" + (indexMinggu+1) + " adalah " + nilai[indexNama][indexMinggu] );
    }
}