import java.util.Arrays;
import java.util.Scanner;

public class Tugas25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("Masukkan Jumlah Element: ");
        int count = sc.nextInt();

        int arr[] = new int[count];
        int temp = 0;
        
        for (int i = 0; i<arr.length; i++) {
            System.out.print("Masukkan Bilangan: ");
            int bil = sc.nextInt();

            arr[i] = bil;

            total += bil;
        }


        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<(arr.length-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("Nilai terendah: " + arr[0]);
        System.out.println("Nilai rata-rata: " + (double) total / arr.length);
        System.out.println("Nilai tertinggi: " + arr[arr.length - 1]);


        sc.close();
    }
}
