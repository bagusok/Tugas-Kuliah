import java.util.Scanner;

class Antrian {

    private static String queue[][] = new String[10][2]; // [[nama, status]]
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        selectMenu();
        sc.close();
    }

    private static void selectMenu() {

        System.out.println("===========================================");
        System.out.println("=    Selamat Datang Di Antrian Klinik     =");
        System.out.println("===========================================");

        
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Hapus Antrian");
        System.out.println("3. Lihat Antrian");
        System.out.println("4. Panggil Antrian");
        System.out.println("5. Keluar");

        System.out.print("Pilih Menu: ");   
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                addQueue();
                break;
            case 2:
                deleteQueue();
                break;
            case 3:
                viewQueue();
                break;
            case 4:
            callQueue();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }

    }


    private static void addQueue() {
        System.out.println("Tambah Antrian");
        System.out.print("Masukkan Nama: ");
        String nama = sc.next();

        for (String[] people : queue){
            if (people[0] == null) {
                people[0] = nama;
                people[1] = "0";
                break;
            }else{
                System.out.println("Antrian Penuh");
            }
        }

        selectMenu();
    }

    private static void deleteQueue() {
        System.out.println("Hapus Antrian");
        System.out.println("Masukkan Nama: ");
        String nama = sc.nextLine();

        for (int i = 0; i < queue.length; i++) {
            if (queue[i][0].equals(nama)) {
                queue[i][0] = "";
                queue[i][1] = "";
            }else{
                System.out.println("Data tidak ditemukan");
            }
        }

        selectMenu();
    }

    private static void viewQueue() {
        System.out.println("Lihat Antrian");
        for (int i = 0; i < queue.length; i++) {
            System.out.println("Nama: " + queue[i][0]);
            System.out.println("Status: " + queue[i][1]);
        }

        selectMenu();
    }


    private static void callQueue() {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i][0] == "0") {
                queue[i][1] = "1";
                System.out.println("Nama: " + queue[i][0] + " dipanggil!");
                break;
            }else{
                System.out.println("Data tidak ditemukan");
            }
        }
        selectMenu();
    }


}