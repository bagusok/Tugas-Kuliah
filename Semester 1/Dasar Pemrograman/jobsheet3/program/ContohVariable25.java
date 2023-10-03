class ContohVariable25{
    public static void main(String[] args) {
        String hobySaya = "Bermain Petak Umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        int umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println(hobySaya);
        System.out.println("Apakah saya pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi %s", ipk, tinggi));
    }
}