package bangunruang;

public class BangunRuang {
    Bola bola;
    Kerucut kerucut;
    LimasSegiEmpatSamaSisi limasSegiEmpatSamaSisi;

    BangunRuang(Bola bola) {
        this.bola = bola;
    }

    BangunRuang(Kerucut kerucut) {
        this.kerucut = kerucut;
    }

    BangunRuang(LimasSegiEmpatSamaSisi limasSegiEmpatSamaSisi) {
        this.limasSegiEmpatSamaSisi = limasSegiEmpatSamaSisi;
    }

    public double getLuasPermukaan() {
        if (bola != null) {
            return bola.getLuasPermukaan();
        } else if (kerucut != null) {
            return kerucut.getLuasPermukaan();
        } else {
            return limasSegiEmpatSamaSisi.getLuasPermukaan();
        }
    }

    public double getVolume() {
        if (bola != null) {
            return bola.getVolume();
        } else if (kerucut != null) {
            return kerucut.getVolume();
        } else {
            return limasSegiEmpatSamaSisi.getVolume();
        }
    }
}
