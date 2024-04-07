package percobaan1;

class Barang {

    int kode;
    String nama, kategori;

    Barang(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }

    void tampilBarang() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
    }
}