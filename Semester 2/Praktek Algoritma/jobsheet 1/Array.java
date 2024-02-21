import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai[] = new int[8];
        String[] mk = {"Pancasila", "KTI", "CTPS", "MTK", "BHS INGGRIS", "DASPRO", "PRAK. DASPRO", "K3LH"};
        double sum = 0;

        System.out.print("Pancasila: ");
        nilai[0] = input.nextInt();
        System.out.print("KTI: ");
        nilai[1] = input.nextInt();
        System.out.print("CTPS: ");
        nilai[2] = input.nextInt();
        System.out.print("MTK: ");
        nilai[3] = input.nextInt();
        System.out.print("BHS INGGRIS: ");
        nilai[4] = input.nextInt();
        System.out.print("DASPRO: ");
        nilai[5] = input.nextInt();
        System.out.print("PRAK. DASPRO: ");
        nilai[6] = input.nextInt();
        System.out.print("K3LH: ");
        nilai[7] = input.nextInt();

        int  i = 0;
        for (int nil: nilai) {
            if (nil < 0 || nil > 100) {
                System.out.println("Nilai tidak valid");
                input.close();
                return;
            }
            
            String[] getIp = nilaiHuruf(nil);
            sum += Double.parseDouble(getIp[1]);
            System.out.println(mk[i] +" : " + nilai[i] + " " + getIp[0]+ " " + getIp[1]);


            i++;
        }

        System.out.println("Total: " + sum);
        double ip = sum / 8;

        System.out.println("IP: " + Double.toString(ip));
       input.close();
    }

    private static String[] nilaiHuruf(int nilai) {
        if(nilai > 80 && nilai <= 100){
            String[] a = {"A", "4"};
            return a;
        }else if(nilai >73){
            String[] a = {"B+", "3.5"};
            return a;
        }else if(nilai >65){
            String[] a = {"B", "3"};
            return a;
        }else if(nilai >60){
            String[] a = {"C+", "2.5"};
            return a;
        }else if(nilai >50){
            String[] a = {"C", "2"};
            return a;
        }else if(nilai >39){
            String[] a = {"D", "1"};
            return a;
        }else {
            String[] a = {"E", "0"};
            return a;
        }
    }
}