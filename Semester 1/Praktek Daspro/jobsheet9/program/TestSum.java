import java.util.Scanner;

public class TestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, n;
        int x[];

        System.out.print("Masukkan jumlah bilangan: ");
        n = sc.nextInt();


        x = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
            x[i] = sc.nextInt();
            sum += x[i];
        }

        System.out.println("Jumlah bilangan = " + sum);


    }
}
