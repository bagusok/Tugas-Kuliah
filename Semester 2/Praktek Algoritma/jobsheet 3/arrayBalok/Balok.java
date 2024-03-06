package arrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
}

