package testSearching;

import java.util.Scanner;

public class Pencarian {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah(Buku bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku m : listBk) {
            m.tampilDataBuku();
            System.out.println("----------------------");
        }
    }

    public int findSeqSearch(int cari) {
       int posisi = -1;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }

        return posisi;

    }

    public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public Buku findBuku(int cari) {

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                return listBk[i];
                
            }

        }
     
        return null;
    }

  

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }


    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            listBk[pos].tampilDataBuku();
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

        Pencarian pencarian = new Pencarian();
        int jmlBuku = 2;

    //     // for (int i = 0; i < jmlBuku; i++) {
    //     //     System.out.print("Kode Buku: ");
    //     //     int kode = sc.nextInt();
    //     //     sc.nextLine();
    //     //     System.out.print("Judul Buku: ");
    //     //     String judul = sc.nextLine();
    //     //     System.out.print("Tahun Terbit: ");
    //     //     int thn = sc.nextInt();
    //     //     sc.nextLine();
    //     //     System.out.print("Pengarang: ");
    //     //     String pengarang = sc.nextLine();
    //     //     System.out.print("Stock: ");
    //     //     int stock = sc.nextInt();
    //     //     sc.nextLine();

    //     //     Buku bk = new Buku(kode, judul, thn, pengarang, stock);
    //     //     pencarian.tambah(bk);

    //     //     System.out.println("===================");

    //     // }
    pencarian.tambah(new Buku(20210, "Pemrograman Java", 2019, "Andi", 10));
    pencarian.tambah(new Buku(20211, "Pemrograman Java", 2019, "Andi", 10));
    pencarian.tambah(new Buku(20212, "Pemrograman Java", 2019, "Andi", 10));
    pencarian.tambah(new Buku(20214, "Pemrograman Java", 2019, "Andi", 10));
        pencarian.tambah(new Buku(20215, "Pemrograman Java", 2019, "Andi", 10));
    // System.out.println("Masukkan kode buku yang dicari: ");
    //     int cari = sc.nextInt();
    //     int pos = pencarian.findSeqSearch(cari);
    //     // System.out.println(pos);
    //     pencarian.tampilPosisi(cari, pos);
    //     pencarian.tamilData(cari, pos);

    // Buku dataBuku = pencarian.findBuku(102);
    // dataBuku.tampilDataBuku();

    // Binary Search
    int posisi  = pencarian.findBinarySearch(20210, 0, pencarian.listBk.length - 1);
    pencarian.tampilData(20210, posisi);
    
    }
}
