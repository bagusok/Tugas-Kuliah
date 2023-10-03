import java.util.Scanner;

public class HitungJarakTembak {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int jarak;

        System.out.print("Masukkan jarak: ");
        jarak = input.nextInt();

        if (jarak <= 5){
            System.out.println("Meele Weapon");
        }else{
            System.out.println("Range Weapon");
        }

        input.close();
    }
}
