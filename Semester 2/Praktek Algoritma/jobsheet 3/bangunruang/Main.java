package bangunruang;

public class Main {

    public static void main(String[] args) {
        // Jumlah bangun ruang
        int jumlahBangunRuang = 3;

        // Array of objects
        BangunRuang[] bangunRuangs = new BangunRuang[jumlahBangunRuang];

        // Looping untuk input data dan menghitung luas permukaan dan volume
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang " + (i + 1) + ":");
            System.out.print("Jenis bangun ruang (kerucut, limas, bola): ");
            String jenisBangunRuang = System.console().readLine().toLowerCase();

            switch (jenisBangunRuang) {
                case "kerucut":
                    System.out.print("Jari-jari: ");
                    double jariJariKerucut = Double.parseDouble(System.console().readLine());
                    System.out.print("Sisi miring: ");
                    double sisiMiringKerucut = Double.parseDouble(System.console().readLine());
                    bangunRuangs[i] = new BangunRuang(new Kerucut(jariJariKerucut, sisiMiringKerucut));
                    System.out.println("Luas permukaan: " + bangunRuangs[i].getLuasPermukaan());    
                    System.out.println("Volume: " + bangunRuangs[i].getVolume());
                    break;
                case "limas":
                    System.out.print("Panjang sisi alas: ");
                    double panjangSisiAlasLimas = Double.parseDouble(System.console().readLine());
                    System.out.print("Tinggi limas: ");
                    double tinggiLimas = Double.parseDouble(System.console().readLine());
                    bangunRuangs[i] = new BangunRuang(new LimasSegiEmpatSamaSisi(panjangSisiAlasLimas, tinggiLimas));
                    System.out.println("Luas permukaan: " + bangunRuangs[i].getLuasPermukaan());    
                    System.out.println("Volume: " + bangunRuangs[i].getVolume());
                    break;
                case "bola":
                    System.out.print("Jari-jari: ");
                    double jariJariBola = Double.parseDouble(System.console().readLine());
                    bangunRuangs[i] = new BangunRuang(new Bola(jariJariBola));
                    System.out.println("Luas permukaan: " + bangunRuangs[i].getLuasPermukaan());    
                    System.out.println("Volume: " + bangunRuangs[i].getVolume());
                    break;
                default:
                    System.out.println("Jenis bangun ruang tidak valid!");
                    i--;
                    continue;
            }
        }

        // Tampilkan hasil
        for (BangunRuang bangunRuang : bangunRuangs) {
            System.out.println("\n" + bangunRuang.getClass().getSimpleName() + ":");
            System.out.println("Luas permukaan: " + bangunRuang.getLuasPermukaan());
            System.out.println("Volume: " + bangunRuang.getVolume());
        }
    }
}
