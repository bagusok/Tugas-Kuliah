package bank;

public class Rekening {
    String norek, nama, tlp, email;
    double saldo;

    public Rekening(String norek, String nama, String tlp, String email, double saldo) {
        this.tlp = tlp;
        this.email = email;
        this.norek = norek;
        this.nama = nama;
        this.saldo = saldo;

    }

    public void print() {
        System.out.println("====== Inforasi Rekening ======");
        System.out.println("No Rekening : " + norek);
        System.out.println("Nama        : " + nama);
        System.out.println("Telepon     : " + tlp);
        System.out.println("Email       : " + email);
        System.out.println("Saldo       : " + saldo);
        System.out.println();
    }

    public void setor(double jumlah) {
        System.out.println("Nama: " + nama);
        System.out.println("No Rekening: " + norek);
        System.out.println("======================================");
        System.out.println("Setor "+ jumlah +" Berhasil");
        System.out.println("Saldo Awal : " + saldo);
        saldo += jumlah;
        System.out.println("Saldo Sekarang : " + saldo);
        System.out.println();
    }

    public void tarik(double jumlah) {

        System.out.println("Nama: " + nama);
        System.out.println("No Rekening: " + norek);
        System.out.println("======================================");

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
            System.out.println("Sisa Saldo Anda : " + saldo);
            System.out.println();
        }else{
            System.out.println("Tarik "+ jumlah +" Berhasil");
            System.out.println("Saldo Awal : " + saldo);
            saldo -= jumlah;
            System.out.println("Saldo Sekarang : " + saldo);
            System.out.println();
        }

       
    }
    
}