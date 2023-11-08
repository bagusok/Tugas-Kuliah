import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah: ");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++) {

            for (int j = n; j>=i; j--) {
                System.out.print("*");
            }

        
            System.out.println();
        }

        input.close();
    }
}
