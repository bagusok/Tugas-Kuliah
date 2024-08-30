class Hewan {

    private String nama;
    private int jmlKaki;

    public Hewan(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public int getJmlKaki() {
        return this.jmlKaki;
    }
    

    public void info() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Kaki: " + this.jmlKaki);
    }
    

}