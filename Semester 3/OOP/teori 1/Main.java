public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Puss", 4, "Hitam");
        kucing.info();

        kucing.setNama("Cimi");
        kucing.setWarna("Putih");

        kucing.info();
    }
}
