public class Segitiga {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= 5 - i; a++) {
                System.out.print("  ");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print(b + " ");
            }
            for (int b = i - 1; b >= 1; b--) {
                System.out.print(b + " ");
            }
             System.out.println(); 
        }
    }
}
