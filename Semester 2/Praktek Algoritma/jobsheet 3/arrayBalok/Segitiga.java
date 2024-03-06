package arrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public int hitungKeliling() {
        return alas * 3;
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[3];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas segitiga ke " + i + " : " + sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga ke " + i + " : " + sgArray[i].hitungKeliling());
            System.out.println("===========================");
        }
    }
}
