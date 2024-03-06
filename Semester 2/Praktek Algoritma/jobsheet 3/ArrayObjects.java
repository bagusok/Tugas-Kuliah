import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah array: ");

        PersegiPanjang[] ppArray = new PersegiPanjang[sc.nextInt()];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }

    // public static void main(String[] args) {
    //     PersegiPanjang[][] pp2 = new PersegiPanjang[2][1];

    //     pp2[0][0] = new PersegiPanjang();
    //     pp2[0][0].panjang = 10;
    //     pp2[0][0].lebar = 5;

    //     System.out.println("Persegi Panjang ke-0, Panjang: " + pp2[0][0].panjang + ", Lebar: " + pp2[0][0].lebar);
    // }
}
