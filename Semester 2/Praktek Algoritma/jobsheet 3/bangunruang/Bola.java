package bangunruang;

public class Bola {

    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}
