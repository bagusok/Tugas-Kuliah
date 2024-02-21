import java.util.Scanner;

class Pemilihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiUas = 0;
        int nilaiUts = 0;
        int nilaiTugas = 0;
        int kuis = 0;

        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai Kuis: ");
        kuis = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = input.nextInt();

        if (nilaiUas < 0 || nilaiUas > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiTugas < 0 || nilaiTugas > 100 || kuis < 0 || kuis > 100) {
            System.out.println("Nilai UAS tidak valid");
            input.close();
            return;
        }

        double nilaiAkhir = (nilaiUas * 0.4) + (nilaiUts * 0.3) + (nilaiTugas * 0.2) + (kuis * 0.2);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        String nilaiHuruf = nilaiHuruf(nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Selamat Anda Lulus");

        

        input.close();
       
    }

    static String nilaiHuruf(double nilai) {
      if(nilai > 80 && nilai <= 100){
        return "A";
      }else if(nilai >73){
        return "B+";
        }else if(nilai >65){
        return "B";
        }else if(nilai >60){
        return "C+";
        }else if(nilai >50){
        return "C";
        }else if(nilai >39){
        return "D";
        }else {
        return "E";
        }
    }
}