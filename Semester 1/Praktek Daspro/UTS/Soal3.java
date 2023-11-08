import java.util.Scanner;

class Soal3{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah siswa: ");
    int n = sc.nextInt();

    System.out.println("\n");

    for (int i = 0; i < n; i++) {

        System.out.println("Siswa ke-" + (i + 1) + "\n");

        System.out.print("Masukkan Jurusan Asal(IPA/IPS/BAHASA): ");
        String jurusan = sc.next();

        System.out.print("Masukkan nilai Matematika: ");
        double matematika = sc.nextDouble();

        System.out.print("Masukkan nilai Fisika: ");
        double fisika = sc.nextDouble();

        System.out.print("Masukkan nilai Bahasa Inggris: ");
        double bahasaInggris = sc.nextDouble();

        System.out.print("Masukkan nilai Bahasa Indonesia: ");
        double bahasaIndonesia = sc.nextDouble();

        double rataRata = (matematika + fisika + bahasaInggris + bahasaIndonesia) / 4;

        // System.out.println("Rata-rata nilai: " + rataRata);

        if (jurusan.equalsIgnoreCase("IPA")) {
            if (matematika >= 80 && rataRata >= 80) {
                System.out.println("Selamat, anda lulus D4TI");
            } else if (matematika >= 70 && fisika >= 70) {
                System.out.println("Selamat, anda lulus D3MI");
            } else {
                System.out.println("Maaf, anda tidak lulus");
            }
        } else if (jurusan.equalsIgnoreCase("IPS")) {
            if (matematika >= 80 && rataRata >= 80) {
                System.out.println("Selamat, anda lulus D4TI");
            }else{
                System.out.println("Maaf, anda tidak lulus");
            }
        } else if (jurusan.equalsIgnoreCase("BAHASA")) {
            if (rataRata > 80 && bahasaIndonesia >= 70 && bahasaInggris >= 70 && matematika >= 70 && fisika >= 70) {
                System.out.println("Selamat, anda lulus D3MI");
            }else{
                System.out.println("Maaf, anda tidak lulus");
            }
        }else{
            System.out.println("Maaf, jurusan yang anda masukkan tidak tersedia!");
        }

        System.out.println("\n");

    }
    
    sc.close();
   }
}