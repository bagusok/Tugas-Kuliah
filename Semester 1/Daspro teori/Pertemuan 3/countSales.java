import java.util.Scanner;

class countSales{
    public static void main(String[] args) {
     double comision = 0;    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan Wilayah (A/B): ");
    String region = sc.nextLine();

    System.out.print("Masukkan Jumlah Penjualan (dalam $): ");
    int sales = sc.nextInt();

    if (region.equalsIgnoreCase("A")){
        if (sales < 9000) {
            comision = 0;
        }else if (sales < 13000) {
            comision = 5.5;
        }else if (sales >= 14000) {
            comision = 7.5;
        }
    }else{
        if (sales < 7000) {
            comision = 5.5;
        }else if (sales >= 13000 ) {
            comision = 7.5;
        }else{
            comision = 0;
        }
    }

    System.out.println("Komisi: " + comision + "%");

    }



}