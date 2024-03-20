package bubble_short;


public class Mahasiswa{
    String nama;
    int tahunMasuk;
    double ipk;

    public Mahasiswa(String nama, int tahunMasuk, double ipk){
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("IPK: " + ipk);
    }

    
}
