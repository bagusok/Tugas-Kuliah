import java.util.Scanner;

class Pemilihan2Percobaan125{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();

        if (tahun % 4 == 0){
            if (tahun % 100 != 0){
                System.out.println(tahun + " adalah tahun kabisat");
            }else{
                if (tahun % 400 == 0){
                    System.out.println(tahun + " adalah tahun kabisat");
                }else{
                    System.out.println(tahun + " adalah bukan tahun kabisat");
                }
            }
        } else {
            System.out.println(tahun + " adalah bukan tahun kabisat");
        }

        sc.close();
    }
}