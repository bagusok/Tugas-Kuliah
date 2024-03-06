package bangunruang;

public class Kerucut {

    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double getLuasPermukaan() {
        double luasAlas = Math.PI * jariJari * jariJari;
        double luasSelimut = Math.PI * jariJari * sisiMiring;
        return luasAlas + luasSelimut;
    }

    public double getVolume() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}
