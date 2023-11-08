import java.util.Scanner;

class Soal1{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai Matematika: ");
    double matematika = sc.nextDouble();

    System.out.print("Masukkan nilai Fisika: ");
    double fisika = sc.nextDouble();

    System.out.print("Masukkan nilai Bahasa Inggris: ");
    double bahasaInggris = sc.nextDouble();

    System.out.print("Masukkan nilai Bahasa Indonesia: ");
    double bahasaIndonesia = sc.nextDouble();

    double rataRata = (matematika + fisika + bahasaInggris + bahasaIndonesia) / 4;

    System.out.println("Rata-rata nilai: " + rataRata);
    sc.close();
   }
}