import java.util.Scanner;

public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");

            int menuChoice = input.nextInt();
            input.nextLine(); // Membersihkan newline

            if (menuChoice == 1) {
                System.out.println("Masukkan nama penonton: ");
                String nama = input.nextLine();

                System.out.println("Masukkan baris (1-4): ");
                int baris = input.nextInt();
                if (baris < 1 || baris > penonton.length) {
                    System.out.println("Nomor baris tidak valid. Silakan pilih lagi.");
                    continue;
                }

                System.out.println("Masukkan kolom (1-2): ");
                int kolom = input.nextInt();
                if (kolom < 1 || kolom > penonton[baris - 1].length) {
                    System.out.println("Nomor kolom tidak valid. Silakan pilih lagi.");
                    continue;
                }

                // Membersihkan newline
                input.nextLine();

                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Maaf, kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                }
            } else if (menuChoice == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.print(penonton[i][j] + "\t");
                        } else {
                            System.out.print("***\t");
                        }
                    }
                    System.out.println();
                }
            } else if (menuChoice == 3) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            } else {
                System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
