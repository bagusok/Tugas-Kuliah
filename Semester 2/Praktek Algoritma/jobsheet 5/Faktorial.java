import java.util.Scanner;

class Faktorial{

    public int nilai, pangkat;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i=1; i<=n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialBFwhile(int n) {
        int i = 1;
        int fakto = 1;
        while (i <= n) {
          fakto *= i;
          i++;
        }
        return fakto;
      }
      

    int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i=0; i<n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
          return 1;
        } else if (n % 2 == 1) {
          return pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a;
        } else {
          return pangkatDC(a, n / 2) * pangkatDC(a, n / 2);
        }
      }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("---------");
        // System.out.print("Masukkan jml: ");
        // int iJml = sc.nextInt();

        // Faktorial[] fk = new Faktorial[10];
        // for(int i=0; i<iJml; i++) {
        //     fk[i] = new Faktorial();
        //     System.out.print("masukkan nilai: ");
        //     int iNilai = sc.nextInt();
        //     fk[i].nilai = iNilai;
        // }

        // for(int i=0; i<iJml; i++) {
        //     System.out.println("Hasil BF: "  + fk[i].faktorialBF(fk[i].nilai));
        // }

        // for(int i=0; i<iJml; i++) {
        //     System.out.println("Hasil DC: "  + fk[i].faktorialDC(fk[i].nilai));
        // }

        int a = 2;
        int n = 3;
        Faktorial fk = new Faktorial();

        System.out.println("--------- Hitung Pangkat ---------");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conqueror");

        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
            System.out.println("Hasil BF: "  + fk.pangkatBF(a, n));
                break;
            default:
            System.out.println("Hasil DC: "  + fk.pangkatDC(a, n));
                break;
        }

      


       
       
        
    }

}