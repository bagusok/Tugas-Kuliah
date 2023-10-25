import java.util.Scanner;

public class LinearSearch25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arrayInt;

        System.out.print("Masukkan jumlah element: ");
        int count = sc.nextInt();

        arrayInt = new int[count];

        for (int i = 0; i<arrayInt.length; i++) {
            System.out.print("Masukkan bilangan: ");
            int bil = sc.nextInt();

            arrayInt[i] = bil;
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        for(int i=0; i<arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                System.out.println("Key ada dalam posisi indeks ke-" + i);
                break;
            }else{
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}
