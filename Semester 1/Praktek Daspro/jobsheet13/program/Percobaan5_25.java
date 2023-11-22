public class Percobaan5_25 {
    public static void main(String[] args) {
        tampil("Daspro 2019", 100, 200);
        tampil("Daspro 2019", 1, 2, 3, 4, 5);
        tampil("Polinema");
    }

    static void tampil(String str, int... a) {
        System.out.println("Stirng: "+ str);
        System.out.println("Jumlah argumen: "+ a.length);

        for (int i: a) {
            System.out.println(i);
        }

        System.out.println();
    
    }
}
