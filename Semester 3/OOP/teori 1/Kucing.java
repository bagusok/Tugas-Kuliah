public class Kucing extends Hewan {

    private String warna;

    Kucing(String nama, int jmlKaki, String warna) {
        super(nama, jmlKaki);
        this.warna = warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

    public void info() {
        super.info();
        System.out.println("Warna: " + this.warna);
    }
    
}
