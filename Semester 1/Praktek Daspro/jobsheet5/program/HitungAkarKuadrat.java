import java.util.Scanner;

public class HitungAkarKuadrat {

    public static void main(String[] args) {
        int a, b, c;
        double D, x1, x2;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c: ");
        c = input.nextInt();

        if (a<0){
            System.out.println("Bukan Persamaan Kuadrat");
        }else{
            D = Math.pow(b, 2) - (4*a*c);
            System.out.println("D = " + D);
            if (D>0) {
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }else{
                System.out.println("Akar-akar persamaan kuadrat tidak real");
            }
        }

        input.close();
        
    }
    
}
