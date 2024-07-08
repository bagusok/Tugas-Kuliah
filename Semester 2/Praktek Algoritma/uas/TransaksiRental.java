public class TransaksiRental {
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    BarangRental br;

    TransaksiRental(int kodeTransaksi, int lamaPinjam, String namaPeminjam, BarangRental br, double totalBiaya){
        this.kodeTransaksi = kodeTransaksi;
        this.lamaPinjam = lamaPinjam;
        this.namaPeminjam = namaPeminjam;
        this.br = br;
        this.totalBiaya = totalBiaya;
    }

    
}
