import java.util.Scanner;

public class NestedLoop25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temps[][] = new double[4][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
        }
        System.out.println();
        }

        int k = 1;
        int dummy = 0;
        for(double[] data: temps){
            System.out.print("Kota ke-"+ k +" : ");
            for(double item: data){
                System.out.print(item + " ");   
                dummy += item;
            }
            System.out.println("Rata-rata :" + dummy/7 + "" );
            dummy = 0;
            System.out.println();
            k++;
        }
            
        scanner.close();
    }
}
