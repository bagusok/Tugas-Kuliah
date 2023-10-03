import java.util.Scanner;

public class PemilihanPercobaan225 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Nilai uas: ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts: ");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis: ");
        float kuis = input00.nextFloat();
        System.out.println("Nilai tugas: ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) +(tugas * 0.2f);

        String message;

        if (total > 80) {
            message = "A";
        } else if (total > 73) {
            message = "B+";
        } else if (total > 65) {
            message = "B";
        } else if (total > 60) {
            message = "C+";
        } else if (total > 50) {
            message = "C";
        } else if (total > 39) {
            message = "D";
        } else {
            message = "E";
        }
        System.out.println("Nilai akhir: " + total + " sehingga " + message + "");

        input00.close();
    }
    
}
