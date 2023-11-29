public class TugasIndividu4 {
    public static void main(String[] args) {
        
        for (int bulan = 1; bulan <=12; bulan ++) {
            if (bulan == 1 || bulan == 2 ) {
                System.out.println("Bulan ke-" + bulan + " : " + 1);
                continue;
            }
            int total = fibonanci(bulan-1);
            System.out.println("Bulan ke-" + bulan + " : " + total);
        }

    }

    static int fibonanci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonanci(n - 1) + fibonanci(n - 2);
        }
    }
}
