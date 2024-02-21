import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {

        char[] noPol = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] daerah = {
            {'B','A', 'N', 'T', 'E', 'N'}, 
            {'J','A', 'K', 'A', 'R', 'T', 'A'}, 
            {'B','A', 'N', 'D', 'U', 'N', 'G'}, 
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'}, 
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'}, 
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'}, 
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan No. Pol. : ");
        char inputNopol = input.next().charAt(0);
        
        int index = 0;

        for (char findIndex: noPol) {
            if (findIndex == inputNopol) {
                break;
            }
            index++;
        }

        System.out.print(" Daerah : ");
        for (char daerahIndex: daerah[index]) {
            System.out.print(daerahIndex);
        }
    }
}
