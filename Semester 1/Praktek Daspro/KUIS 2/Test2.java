import java.util.Scanner;

public class Test2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai desimal: ");
        int decimal = scanner.nextInt();

        if (decimal < 1 || decimal > 3999) {
            System.out.println("Masukkan angka antara 1 dan 3999");
        } else {
            String roman = convertToRoman(decimal);
            System.out.println("Notasi Romawi: " + roman);
        }

        scanner.close();
    }

    private static String convertToRoman(int num) {
        // Simpan nilai desimal dan simbol Romawi dalam array
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String roman = "";

        // Lakukan iterasi melalui nilai desimal dan tambahkan simbol Romawi ke string
        for (int i = 0; i < decimalValues.length; i++) {
            while (num >= decimalValues[i]) {
                roman += romanSymbols[i];
                num -= decimalValues[i];
            }
        }

        return roman;
    }
}
