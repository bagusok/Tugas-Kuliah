class Pegawai{
    String name;
    int masaKerjaThn, gajiPokok;
    double jamLembur;

    public Pegawai(String name, int masaKerjaThn, int gajiPokok, double jamLembur){
        this.name = name;
        this.masaKerjaThn = masaKerjaThn;
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }

    public void printData() {
        System.out.println("Nama : " + name);
        System.out.println("Masa Kerja : " + masaKerjaThn + " tahun");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Jam Lembur : " + jamLembur);
        System.out.println("Gaji Lembur : " + hitungGajiLembur());
        System.out.println("Tunjangan : " + hitungTunjangan());
        System.out.println("Gaji Total : " + Double.toString(hitungGajiTotal()));
        System.out.println();

    }

    public double hitungGajiLembur() {

        if (masaKerjaThn < 5) {
            return 0.05 * gajiPokok * jamLembur;
        }else{
            return 0.1 * gajiPokok * jamLembur;
        
        }
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungGajiLembur() + hitungTunjangan();
    }

    public double hitungTunjangan() {
        if (masaKerjaThn < 5) {
            return 0.25 * gajiPokok;
        }else{
            return 0.5 * gajiPokok;
        }
    }


    public static void main(String[] args) {
        Pegawai[] pegawais = new Pegawai[6];

        pegawais[0] = new Pegawai("Budi", 2, 2000000, 5);
        pegawais[1] = new Pegawai("Tono", 3, 3000000, 6);
        pegawais[2] = new Pegawai("Adi", 4, 4000000, 7);
        pegawais[3] = new Pegawai("Rina", 5, 5000000, 8);
        pegawais[4] = new Pegawai("Joko", 6, 6000000, 9);
        pegawais[5] = new Pegawai("Ani", 7, 7000000, 10);


        int totalGajiG5 = 0;
        int jmlPegawaiG5 = 0;

        int indexGajiLemburTertinggi = 0;

        for (int i = 0; i < pegawais.length; i++) {
            if (pegawais[i].masaKerjaThn < 5) {

                if (pegawais[i].hitungGajiLembur() > pegawais[indexGajiLemburTertinggi].hitungGajiLembur()) {
                    indexGajiLemburTertinggi = i;
                }
            }else{
                totalGajiG5 += pegawais[i].hitungGajiTotal();
                jmlPegawaiG5++;
            }
        }

        System.out.println("Rata-rata gaji pegawai dengan masa kerja lebih dari 5 tahun adalah " + totalGajiG5 / jmlPegawaiG5);
        System.out.println();
        System.out.println("Pegawai dengan gaji lembur tertinggi masa kerja dibawah 5 tahun adalah: ");
        pegawais[indexGajiLemburTertinggi].printData();
        
    }
}