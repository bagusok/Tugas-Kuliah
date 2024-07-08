package tugas;

public class MataKuliah {
    String nama, kode;
    double nilai;
    int sks;
   
    public MataKuliah(String nama, String kode, double nilai, int sks){
        this.nama = nama;
        this.kode = kode;
        this.nilai = nilai;
        this.sks = sks;
    }

    public MataKuliah(String nama, String kode, int sks){
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }
}
