class Percobaan1{
    public static void main(String[] args) {
        System.out.println(factorialRekursif(5));
        System.out.println(factorialIteratif(5));
    }

    static int factorialRekursif(int n) {
        if (n== 0) {
            return 1;
        } else {
            return n * factorialRekursif(n-1);
        }
    }

    static int factorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
}