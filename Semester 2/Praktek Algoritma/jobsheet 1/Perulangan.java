import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nim: ");
        String nim = input.nextLine();

        int jmlNim = nim.length();

        String endNim = nim.substring( jmlNim -1, jmlNim);

        int indexLoop = 0;

        if (Integer.parseInt(endNim) < 10) {
            indexLoop = Integer.parseInt(endNim) + 10;
        }else{
            indexLoop = Integer.parseInt(endNim);
        }

        for (int i = 1; i <= indexLoop; i++) {

            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 != 0) {
                System.out.print("*" + " ");
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        input.close();
    }
}
