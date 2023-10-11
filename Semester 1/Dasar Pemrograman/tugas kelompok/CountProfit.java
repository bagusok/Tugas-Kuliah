import java.util.Scanner;

class CountProfit{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double p, l = 0;

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter sale price: ");
        double sp = sc.nextDouble();

        if (cp <= sp) {
            if (cp == sp) {
                System.out.println("No profit or loss");
            } else {
                p = (sp - cp);
                System.out.println("Profit is: " + p);
            }
        }else{
            l = (cp - sp);
            System.out.println("Loss is: " + l);
        }
    }
}