public class TugasFlow1 {
    public static void main(String[] args) {
        int bil1=28, bil2=54, bil3=15;
        int g;

        if (bil1 > bil2){
            g = bil1;
        }else{
            g = bil2;
        }

        if (g > bil3) {

            System.out.println("Bilangan terbesar adalah " + g);
        }else{
            System.out.println("Bilangan terbesar adalah " + bil3);
        }
    }
}
