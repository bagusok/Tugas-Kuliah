package bank;

public class Bank {
    
    private Rekening[] rekening;
    private int top;
    
    public Bank(int jumlahRekening) {
        rekening = new Rekening[jumlahRekening];
        top = 0;
    }

    public void findRekByName(String name){
        for (int i = 0; i < rekening.length; i++) {
            if (rekening[i].nama.equalsIgnoreCase(name)) {
                rekening[i].print();
                return;
            }
        }
        
        System.out.println("Rekening dengan nama "+ name +" tidak ditemukan");
    }

    int findIndexRekByNorek(String norek){
        for (int i = 0; i < rekening.length; i++) {
            if (rekening[i].norek.equalsIgnoreCase(norek)) {
                return i;
            }
        }
        return -1;
    }

    public void showAllRek(){
        for(Rekening rek : rekening){
            rek.print();
        }
    }

    public void addRek(Rekening rek) {
        rekening[top] = rek;
        top++;
    }

    public void sortRekByDesc(){
        for (int i = 0; i < rekening.length; i++) {
            for (int j = 0; j < rekening.length; j++) {
                if (rekening[i].saldo > rekening[j].saldo) {
                    Rekening temp = rekening[i];
                    rekening[i] = rekening[j];
                    rekening[j] = temp;
                }
            }
        }

        showAllRek();
    }

    public void showRekUnder50() {
        for(Rekening rek : rekening){
            if (rek.saldo < 50000) {
                rek.print();
            }
        }
    }

    public void addSaldo(String norek, double jumlah) {
        int index = findIndexRekByNorek(norek);
        if (index != -1) {
            rekening[index].setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    public void tarikSaldo(String norek, double jumlah) {
        int index = findIndexRekByNorek(norek);
        if (index != -1) {
            rekening[index].tarik(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    public static void main(String[] args) {

        
        // INPUT ALL REK
        Bank b = new Bank(11);
        b.addRek(new Rekening("160309273084", "Wallace", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu", 10000));
        b.addRek(new Rekening("161006170573", "Darius", "1-357-843-0547", "nec@lectusjusto.org", 7000));
        b.addRek(new Rekening("162404012243", "Fuller ", "571-7062", "convallis@Vestibulumanteipsum.org", 5000));
        b.addRek(new Rekening("162705250112", "Malcolm", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000));
        b.addRek(new Rekening("169712042416", "Geoffrey", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com", 50000));
        b.addRek(new Rekening("161007278862", "Rudyard", "650-5379", "Proin.eget@velitegestaslacinia.ca", 123000));
        b.addRek(new Rekening("164603294259", "Troy", "897-7608", "pede.Suspendisse.dui@a.ca", 100000));
        b.addRek(new Rekening("163204213437", "Alec ", "792-4447", "non@mus.com", 34000));
        b.addRek(new Rekening("161807297229", "Walter", "863-8209 ", "Pellentesque.ut.ipsum@neque.ca", 334544));
        b.addRek(new Rekening("169503136823", "Simon", "592-6919 ", "tellus.justo.sit@commodoauctor.net", 23444));
        b.addRek(new Rekening("168507083528", "Kamal", "1-115-339-7678", "dictum@nec.edu", 567770));
    
        // // Tampil Semua Data Rekening
        b.showAllRek();

        // Urutkan saldo rekening dari yang terbesar
        b.sortRekByDesc();

        // Tampilkan Data Rekening yang Saldo nya kurang dari 50.000
        b.showRekUnder50();

        // // Cari Rekening berdasarkan nama
        b.findRekByName("Malcolm");
        b.findRekByName("Kamal");
        // // Nama Joni Tidak Ada
        b.findRekByName("Joni");

        // // Tarik Uang Rekening Jmlah Tertentu
        b.addSaldo("161007278862", 250000);
        // // Rekening Salah
        b.addSaldo("111111111", 250000);

        // Setor Uang Rekening Jmlah Tertentu
        b.tarikSaldo("161807297229", 100000);
        // Saldo Tidak Cukup
        b.tarikSaldo("161807297229", 4000000);
        // Rekening Salah
        b.tarikSaldo("111111111", 250000);



    }





}
