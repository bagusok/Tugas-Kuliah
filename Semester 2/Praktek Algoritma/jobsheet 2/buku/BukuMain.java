package buku;
public class BukuMain {
    public static void main(String[] args) {
        Buku25 buku = new Buku25();

        buku.judul = "Today Ends Tomorrow Comes";
        buku.pengarang = "Denanda Pratiwi";
        buku.halaman = 198;
        buku.stock = 13;
        buku.harga = 71000;

        buku.tampilInformasi();
        buku.terjual(5);
        buku.gantiHarga(60000);
        buku.tampilInformasi();

        System.out.println("--------------------");

        Buku25 buku2 = new Buku25("Self Reward", "Maheer Ayesha", 160, 29, 59000);
        buku2.terjual(11);
        buku2.tampilInformasi();

        System.out.println("--------------------");

        Buku25 buku25 = new Buku25("The Power of Habit", "Charles Duhigg", 371, 7, 120000);
        buku25.terjual(3);
        buku25.tampilInformasi();
        System.out.println("--");
        System.out.println("Total Harga: " + buku25.hitungHargaTotal());
        System.out.println("Diskon: " + buku25.hitungDiskon() + "%" );
        System.out.println("Harga Bayar: " + buku25.hargaBayar);


    }
}
