/**
 * TugasIndividu1
 */
public class TugasIndividu1 {

    public static void main(String[] args) {
        System.out.println(deretDescRekursif(5));
        System.out.print(deretDescIteratif(5));
    }

    static int deretDescRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print(n + " ");
            return deretDescRekursif(n-1);
        }
    }

    static int deretDescIteratif(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        return 0;

    
    }


}