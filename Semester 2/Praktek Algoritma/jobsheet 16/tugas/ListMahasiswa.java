package tugas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListMahasiswa {
    ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
    ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    Queue<Integer> queue = new LinkedList<>(); 

    void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    void hapus(int index) {
        mahasiswas.remove(index);
    }

    // Prosedur hapus menggunakan Queue
    void hapusMahasiswaDenganQueue() {
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nim = scanner.nextLine();
        
        int index = linearSearch(nim);
        if (index == -1) {
            System.out.println("Mahasiswa tidak ditemukan");
            return;
        }

        queue.add(index); 
        hapus(queue.poll()); 
        System.out.println("Mahasiswa dengan NIM " + nim + " telah dihapus.");
    }

    void update(int index, Mahasiswa mahasiswa) {
        mahasiswas.set(index, mahasiswa);
    }

    void tampil() {
        mahasiswas.stream().forEach((mhs) -> {
            System.out.println(mhs);
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        // Urutkan dulu array list
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs1.nim.compareTo(mhs2.nim));
        
        // Lakukan binary search
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), 
                                             (mhs1, mhs2) -> mhs1.nim.compareTo(mhs2.nim));
        
        return index >= 0 ? index : -1;
    }

    MataKuliah searchByKode(String kode) {
        for (MataKuliah mk : mataKuliahs) {
            if (mk.kode.equals(kode)) {
                return mk;
            }
        }
        return null;
    }

    void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
    }

    void sortDescending() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));
    }

    void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Mahasiswa");
        System.out.println("6. Exit");
    }

    void inputNilai() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        int index = linearSearch(nim);
        if (index == -1) {
            System.out.println("Mahasiswa tidak ditemukan");
            return;
        }

        Mahasiswa m = mahasiswas.get(index);
        System.out.print("Masukkan Kode Mk: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan Nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine();

        // Cari mata kuliah
        MataKuliah mk = searchByKode(kode);
        if (mk == null) {
            System.out.println("Mata kuliah tidak ditemukan");
            return;
        }

        mk.nilai = nilai;
        m.mataKuliahs.add(mk);
        System.out.println("Nilai berhasil dimasukkan ke matakuliah: " + mk.nama);
    }

    void tampilSemuaNilaiMahasiswa() {
        mahasiswas.stream().forEach((mhs) -> {
            System.out.println("NIM: " + mhs.nim + ", Nama: " + mhs.nama);
            mhs.mataKuliahs.stream().forEach((mk) -> {
                System.out.println("- Mata Kuliah: " + mk.nama + ", Nilai: " + mk.nilai);
            });
            System.out.println();
        });
    }

    void cariNilaiByNim() {
        System.out.print("Masukkan nim: ");
        String nim = scanner.nextLine();

        int index = linearSearch(nim);
        if (index == -1) {
            System.out.println("Mahasiswa tidak ditemukan");
            return;
        }

        Mahasiswa m = mahasiswas.get(index);
        System.out.println("NIM: " + m.nim + ", Nama: " + m.nama);
        m.mataKuliahs.stream().forEach((mk) -> {
            System.out.println("- Mata Kuliah: " + mk.nama + ", Nilai: " + mk.nilai);
        });
        System.out.println();
    }

    void urutNilaiByNiilaiTerbesar() {
        mahasiswas.stream().forEach((mhs) -> {
            mhs.mataKuliahs.sort((mk1, mk2) -> Double.compare(mk2.nilai, mk1.nilai));
        });
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        // isi mahasiswa
        Mahasiswa m = new Mahasiswa("201234", "Nouren", "08123456789");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "08123456789");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "08123456789");
        lm.tambah(m, m1, m2);
        lm.tambah(
            new Mahasiswa("201237", "Uwais", "08123456789"),
            new Mahasiswa("201238", "Al-Qarni", "08123456789"),
            new Mahasiswa("201239", "mei mei", "08123456789"));

        // isi list mk
        lm.mataKuliahs.add(new MataKuliah("Internet Of Things", "00001", 3));
        lm.mataKuliahs.add(new MataKuliah("Algoritma Struktur data", "00002", 2));
        lm.mataKuliahs.add(new MataKuliah("Algoritma dan Pemrograman", "00003", 2));
        lm.mataKuliahs.add(new MataKuliah("Praktikum Algoritma dan Struktur Data", "00004", 3));
        lm.mataKuliahs.add(new MataKuliah("Praktikum Algoritma dan Pemrograman", "00005", 3));

        boolean isExit = false;

        while (!isExit) {
            lm.menu();

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    lm.inputNilai();
                    break;
                case 2:
                    lm.tampilSemuaNilaiMahasiswa();
                    break;
                case 3:
                    lm.cariNilaiByNim();
                    break;
                case 4:
                    lm.urutNilaiByNiilaiTerbesar();
                    break;
                case 5:
                    lm.hapusMahasiswaDenganQueue();
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }

        scanner.close();
    }
}
