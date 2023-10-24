import java.util.Arrays;

public class BubbleSortExample25 {
    public static void main(String[] args) {
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        for(int i=0; i<intData.length; i++) {
            for(int j=1; j<(intData.length-i); j++) {
                if(intData[j-1] < intData[j]) {
                    temp = intData[j-1];
                    intData[j-1] = intData[j];
                    intData[j] = temp;

                }
            }
        }

        System.out.println("Hasil Pengurutan: ");
        for(int i=0; i<intData.length; i++) {
            System.out.print(intData[i] + " ");
        }
    }
}
