import java.util.Scanner;

class PemilihanPercobaan25{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        String output = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + output + "");
        
        input.close();
    }
}