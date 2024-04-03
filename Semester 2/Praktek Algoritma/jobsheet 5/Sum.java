import java.util.Scanner;

public class Sum {
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i=0; i<elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
          return arr[l];  // Base case: single element sub-array
        } else {
          int mid = (l + r) / 2;  // Correct integer division for mid index
          double lsum = totalDC(arr, l, mid);  // Recursive call for left sub-array
          double rsum = totalDC(arr, mid + 1, r);  // Recursive call for right sub-array (adjusted starting index)
          return lsum + rsum;  // Return the sum of left and right sub-arrays
        }
      }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlP = sc.nextInt();

        for (int i=0; i<jmlP; i++) {
        System.out.println("Perusahaan ke-"+(i+1));
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();
        Sum sm = new Sum(elm);
        System.out.println("==================");

        for (int j=0; j<sm.elemen; j++) {
            System.out.print("masukkan keuntungan bulan ke-"+(j+1)+": ");
            sm.keuntungan[j] = sc.nextDouble();
        }

        System.out.println("Total keuntungan BF: "+sm.totalBF(sm.keuntungan));
        System.out.println("Total keuntungan DC: "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));

        System.out.println("==================");
        }

        
    }
}
