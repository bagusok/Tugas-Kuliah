package percobaan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListMahasiswa {
    ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

    void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    void hapus(int index) {
        mahasiswas.remove(index);
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

    void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
    }

    void sortDescending() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));
    }
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Nouren", "08123456789");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "08123456789");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "08123456789");

        lm.tambah(m, m1, m2);
        lm.tampil();

        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleena Lela", "08123456789"));
        System.out.println();
        lm.tampil();

        System.out.println();
        lm.sortDescending();
        lm.tampil();
    }

}
