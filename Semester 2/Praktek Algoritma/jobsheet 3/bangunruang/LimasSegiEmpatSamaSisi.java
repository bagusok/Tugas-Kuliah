package bangunruang;

 public class LimasSegiEmpatSamaSisi {

    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double getLuasPermukaan() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSelimut = 4 * (1.0 / 2) * panjangSisiAlas * tinggiLimas;
        return luasAlas + luasSelimut;
    }

    public double getVolume() {
        return (1.0 / 3) * getLuasAlas() * tinggiLimas;
    }

    private double getLuasAlas() {
        return panjangSisiAlas * panjangSisiAlas;
    }
}
    

