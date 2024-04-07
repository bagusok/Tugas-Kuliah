package percobaan1;

import java.util.Scanner;

public class Gudang {
    Barang[] tumpukan;
    int size, top;

    Gudang(int kapasitas) {
        this.size = kapasitas;
        tumpukan = new Barang[kapasitas];
        top = -1;
    }

    boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(Barang brg) {
       if (!cekPenuh()) {
        top++;
        tumpukan[top] = brg;
        System.out.println("Barang berhasil ditambahkan");
       }else{
        System.out.println("Tumpukan penuh, barang tidak bisa ditambahkan");
       }
    }

    Barang ambilBarang() {
        if (!cekKosong()) {
            Barang temp = tumpukan[top];
            top--;
            System.out.println("Barang berhasil diambil");
            System.out.println("Kode Biner: " + konversiDesimalKeBinner(temp.kode) );
            return temp;
        } else {
            System.out.println("Tumpukan kosong, tidak ada barang yang bisa diambil");
            return null;
        }
    }

    Barang lihatBarangTeratas() {
        if (!cekKosong()) {
            return tumpukan[top];
        } else {
            return null;
        }
    }

    void tampilBarang() {
       if (!cekKosong()) {
        for (int i = top; i >= 0; i--) {
            tumpukan[i].tampilBarang();
            System.out.println("-------------");
        }
        }else{
            System.out.println("Tumpukan kosong");
        }
    }

    // Percobaan 2

    String konversiDesimalKeBinner(int kode) {
        StackKonversi stack = new StackKonversi(32);

        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode /= 2;
        }

        String biner = new String(); 
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }

    Barang lihatBarangTerbawah() {
        if (!cekKosong()) {
            return tumpukan[0];
        } else {
            return null;
        }
    }

    void cariBarang(int kode) {

        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].kode == kode) {
                System.out.println("Barang ditemukan pada tumpukan ke-" + (top - i + 1));
               break;
            }
        }
        System.out.println("Barang tidak ditemukan");

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selamat datang di Gudang");
        System.out.println("Masukkan kapasitas barang: ");
        int kapasitas = sc.nextInt();
        Gudang gudang = new Gudang(kapasitas);
        
        while (true) {
            System.out.println("\n Menu: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Lihat Barang Terbawah");
            System.out.println("5. Cari Barang");
            System.out.println("6. Keluar");

            System.out.print("Pilih Operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Kategori Barang: ");
                    String kategori = sc.nextLine();
                    Barang brg = new Barang(kode, nama, kategori);
                    gudang.tambahBarang(brg);
                    break;
                case 2:
                    gudang.ambilBarang();    
                    break;
                case 3:
                    gudang.tampilBarang();
                    break;
                case 4:
                    Barang terbawah = gudang.lihatBarangTerbawah();
                    if (terbawah != null) {
                        terbawah.tampilBarang();
                    } else {
                        System.out.println("Tumpukan kosong");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan kode barang yang dicari: ");
                    int kodeCari = sc.nextInt();
                    gudang.cariBarang(kodeCari);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
