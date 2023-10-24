public class ReverseArray {

    public static void main(String[] args) {

        int[] arr ={1, 2,  3, 4, 5,21,22,23,21,22, 0};

        int[] reverse =  reverse(arr);

        for (int i: reverse) {
            System.out.print(i + " ");
        }
        
    }

    public static int[] reverse(int[] arr) {

        int[] reversed = new int[arr.length];

        for(int i = arr.length; i > 0; i--) {
            reversed[arr.length - i] = arr[i - 1];
        }

        return reversed;
    }
}

