import java.util.Scanner;

public class DoWhileCuti25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Masukkan jatah cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah anda ingin mengambil cuti (y/t) ? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti anda adalah " + jatahCuti);

                    if (jatahCuti == 0) {
                        System.out.println("Jatah cuti anda sudah habis");
                        break;
                    }
                   
                }else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi, tinggal sisa: " + jatahCuti + " hari");
                     
                }
            }
        }while(jatahCuti > 0);

    }
}
