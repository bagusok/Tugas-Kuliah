import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    // Method untuk menampilkan menu
    static void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Peminjaman");
        System.out.println("3. Tampilkan Seluruh Transaksi");
        System.out.println("4. Urutkan transaksi (urut no TNKB)");
        System.out.println("5. Keluar");
        System.out.println();

    }

    // Method untuk melakukan peminjaman
    static void peminjaman(BarangRentalDLL brl, TransaksiDLL trl) {

        // Inisialisasi variabel member
        boolean isMember = false;
   
        // Input data peminjaman
        System.out.print("Masukkan nama peminjam: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan noTNKB: ");
        String noTNKB = sc.nextLine();
        System.out.print("Masukkan lama pinjam: ");
        int lamaPinjam = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah Member (y/n): ");
        String member = sc.nextLine();
        if (member.equalsIgnoreCase("y")) {
            isMember = true;
        }

        // Check apakah kendaraan sudah dipinjam
        BarangRental checkedTNKB = trl.searchByTNKB(noTNKB);
        if (checkedTNKB != null){
            System.out.println("Tidak bisa diproses, Kendaraan dengan noTNKB " + noTNKB + " sudah dipinjam");
            return;
        }else{

            // Check Kendaraan ada apa tidak
            BarangRental checkIfExistTNKB = brl.searchByTNKB(noTNKB);
            if (checkIfExistTNKB != null){

                // Hitungan total biaya beserta diskon
                double totalBiaya = checkIfExistTNKB.biayaSewa * lamaPinjam;

                if (lamaPinjam > 48 && lamaPinjam < 78) {
                    totalBiaya = totalBiaya - (totalBiaya * 0.1);
                } else if (lamaPinjam > 78) {
                    totalBiaya = totalBiaya - (totalBiaya * 0.2);
                }
    
                if (isMember) {
                    totalBiaya = totalBiaya - 25000;
                }

                // Kode transaksi increment otomatis berdasarkan size dari LinkedList
                int kodeTransaksi = trl.size + 1;
                trl.addLast(new TransaksiRental(kodeTransaksi, lamaPinjam, nama, checkIfExistTNKB, totalBiaya));
                System.out.println("Transaksi berhasil ditambahkan, No TNKB: " + noTNKB + " dengan kode transaksi: " + kodeTransaksi + " atas nama: " + nama);
            }else{
                System.out.println("Kendaraan dengan noTNKB " + noTNKB + " tidak ditemukan");
            }
            
        }

    }
    public static void main(String[] args) {


        BarangRentalDLL brdll = new BarangRentalDLL();
        TransaksiDLL trdll = new TransaksiDLL();

        // ISI DATA AWAL
       brdll.addFirst(new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017,25000));
       brdll.addLast(new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 25000));
       brdll.addLast(new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 40000));
       brdll.addLast(new BarangRental("AB 4321 A", "Toyota Innova", "Mobil", 2019, 40000));
       brdll.addLast(new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 40000));


       boolean isExit = false;
       while (isExit == false) {
           menu();
           System.out.print("Pilih menu: ");
           int menu = sc.nextInt();
           sc.nextLine();
           switch (menu) {
               case 1:
                   System.out.println("Daftar Kendaraan: ");
                   brdll.print();
                   break;
               case 2:
                   peminjaman(brdll, trdll);
                   break;
               case 3:
                   System.out.println("Daftar Transaksi: ");
                   trdll.print();
                   break;
               case 4:
                   trdll.sortByNoTNKB();
                   trdll.print();
                   break;
               case 5:
                   isExit = true;
                   break;
               default:
                   System.out.println("Menu tidak tersedia");
                   break;
           }
        
       }


       sc.close();
    }
}
