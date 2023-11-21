import java.util.Scanner;

public class TugasIndividu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah: ");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++) {

            if (n < 3 ) {
                System.out.println("Inputan tidak boleh kurang dari 3");
                break;
            }
            
            for(int j = 1; j<=n; j++){
                if (i == 1 || i == n) {
                   System.out.print(n + " ");
                  
                }else{
             
                    if (j == 1 || j == n){
                        System.out.print(n + " ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }

        
            System.out.println();
        }

        input.close();
    }
}
