import java.util.Scanner;

public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Sudut 1: ");
        int sudut1 = sc.nextInt();
        System.out.print("Masukkan Sudut 2: ");
        int sudut2 = sc.nextInt();
        System.out.print("Masukkan Sudut 3: ");
        int sudut3 = sc.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180){

            if (sudut1 == sudut2 && sudut2 == sudut3){
                System.out.println("Segitiga Sama Sisi");
            }else if ((sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) && sudut1 != 90 && sudut2 != 90 && sudut3 != 90){
                System.out.println("Segitiga Sama Kaki");
            }else if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90){
                System.out.println("Segitiga Siku-Siku");
            }else{
                System.out.println("Segitiga Sembarang");
            }
        }else{
            System.out.println("Bukan Segitiga");
        }

        sc.close();
    }
}
