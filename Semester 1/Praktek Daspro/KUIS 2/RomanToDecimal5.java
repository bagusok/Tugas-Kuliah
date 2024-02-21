import java.util.Scanner;

public class RomanToDecimal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka Romawi: ");
        String romanInput = scanner.nextLine().toUpperCase();

        romanToDecimal(romanInput);
        // System.out.println("Nilai desimal dari " + romanInput + " adalah " + decimalOutput);
        scanner.close();
    }

    public static void romanToDecimal(String roman) {
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        char[] numerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        int decimal = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char numeral = roman.charAt(i);
            int value = getValue(numerals, values, numeral);

            if (value == -1) {
                System.out.println("Ada Angka Romawi yang dimasukkan tidak valid");
                return;
            }

            if (value < prevValue) {
                decimal -= value;
            } else {
                decimal += value;
            }

            prevValue = value;
        }
            System.out.println("Nilai desimal dari " + roman + " adalah " + decimal);
        
    }


    private static int getValue(char[] numerals, int[] values, char numeral) {
        for (int i = 0; i < numerals.length; i++) {
            if (numerals[i] == numeral) {
                return values[i];
            }
        }

        return -1;
    }

}
