package showroom;

public class Mobil {
    String merk, tipe;
    int tahun, topAcc, topPw;

    Mobil(String merk,String tipe,int tahun,int topAcc,int topPw){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcc = topAcc;
        this.topPw = topPw;
    }

    void print(){
        System.out.println("Merk: "+merk);
        System.out.println("Tipe: "+tipe);
        System.out.println("Tahun: "+tahun);
        System.out.println("Top Speed Acceleration: "+topAcc);
        System.out.println("Top Speed Power: "+topPw);
    }

    public static Mobil findMobilTopAcc(Mobil[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low];
        }

        int mid = (low + high) / 2;

        Mobil mobilTercepatKiri = findMobilTopAcc(mobil, low, mid);

        Mobil mobilTercepatKanan = findMobilTopAcc(mobil, mid + 1, high);
        return mobilTercepatKiri.topAcc > mobilTercepatKanan.topAcc ? mobilTercepatKiri : mobilTercepatKanan;
    }

    public static Mobil findMobilLowAcc(Mobil[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low];
        }
        int mid = (low + high) / 2;

        Mobil mobilTerendahKiri = findMobilLowAcc(mobil, low, mid);

        Mobil mobilTerendahKanan = findMobilLowAcc(mobil, mid + 1, high);
        return mobilTerendahKiri.topAcc < mobilTerendahKanan.topAcc ? mobilTerendahKiri : mobilTerendahKanan;
    }

    public static double findAvg(Mobil[] mobil) {
        double totalTopAcc = 0.0;
        for (Mobil mobil1 : mobil) {
            totalTopAcc += mobil1.topAcc;
        }
        return totalTopAcc / mobil.length;
    }
    


    public static void main(String[] args) {
        Mobil mobils[] = new Mobil[8];

        mobils[0] = new Mobil("BMW","M2 Couple",2016,6816,728);
        mobils[1] = new Mobil("Ford","Fiesta ST",2014,3921,575);
        mobils[2] = new Mobil("Nissan","370Z",2009,4360,657);
        mobils[3] = new Mobil("Subaru","BRZ",2014,4058,609);
        mobils[4] = new Mobil("Subaru","Impreza WRX",2013,6255,703);
        mobils[5] = new Mobil("Toyota","AE86",1986,3700,553);
        mobils[6] = new Mobil("Toyota","86?GT",2014,4180,609);
        mobils[7] = new Mobil("Volkswagen","Golf GTI",2014,4180,631);
        
        findMobilTopAcc(mobils, 0, mobils.length - 1).print();
        System.out.println("==========================");
        findMobilLowAcc(mobils, 0, mobils.length - 1).print();
        System.out.println();
        System.out.println("Rata-Rata: " + findAvg(mobils));

    }
}
