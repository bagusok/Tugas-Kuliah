public class TugasIndividu2 {

    private static String ctk = "";
    private static int dummy = 0;

    public static void main(String[] args) {
        System.out.print(hitungPenjumlahan(8));
    }

    static int hitungPenjumlahan(int n) {
        dummy++;
        if (n == 0) {
            System.out.print(ctk);
            return 0;
        } else {
            
            if (n == 1) {
                ctk += dummy + " = ";
            } else {
                ctk += dummy+ " + ";
            }
            return n + hitungPenjumlahan(n-1);
        }
    }
}
