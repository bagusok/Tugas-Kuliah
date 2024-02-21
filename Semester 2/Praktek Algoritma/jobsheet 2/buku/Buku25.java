package buku;
class Buku25 {

    public String judul, pengarang;
    public int halaman = 0, stock= 0, harga = 0, terjual = 0, totalHarga = 0, hargaBayar = 0;

    public Buku25(){}

    public Buku25(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        stock = stok;
        harga = har;
    }

    public void tampilInformasi() {


        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Stock: " + stock);
        System.out.println("Harga: " + harga);

    }

    public void terjual(int jml) {
        if (stock >= 0) {
            terjual += jml;
            stock -= jml;

        }else{
            System.out.println("Stock Habis");
        }
    }

    public void restock(int n) {
        stock += n;
    }

    public void gantiHarga(int hrg) {
        harga = hrg;
    }

    public int hitungHargaTotal() {
        totalHarga = harga * terjual;
        return totalHarga;
    }

    public int hitungDiskon() {

        if (totalHarga > 150000) {
            hargaBayar = totalHarga - (totalHarga * 12 / 100);
            return 12;
        }else if (totalHarga >= 75000) {
            hargaBayar = totalHarga - (totalHarga * 5 / 100);
            return 5;
        }else{
            hargaBayar = totalHarga;
            return 0;
        }
       
    }

    public int hitungHargaBayar() {
        return hargaBayar;
    }


}