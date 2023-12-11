import java.util.ArrayList;
import java.util.Scanner;

class Antrian2 {

    private static String queue[][] = new String[2][3]; // [[nama, status, queueNumber]]
    private static Scanner sc = new Scanner(System.in);
    private static int queueNumberMax = 0;
    private static int queueNumberNow = 0;
    public static void main(String[] args) {
        selectMenu();
        sc.close();
    }

    private static void selectMenu() {

        System.out.println();
        System.out.println("===========================================");
        System.out.println("=       Selamat Datang Di Antrian         =");
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
                System.out.println("Menu tidak ditemukan");
                goBack();
                break;
        }

    }


    private static void addQueue() {

        if (isQueueFull()) {
            System.out.println("Antrian Penuh");
           
            goBack();
        }

        System.out.println("Tambah Antrian");
        System.out.print("Masukkan Nama: ");
        String nama = sc.next();


         for (int i = 0; i < queue.length; i++) {
            if (queue[i][0] == null) {
                queue[i][0] = nama;
                queue[i][1] = "Menunggu";
                queue[i][2] = Integer.toString(queueNumberMax);
                queueNumberMax++;
                break;
            }
        }


        System.out.println("Antrian Berhasil Ditambahkan");

        System.out.println();

        goBack();
    }

    private static void deleteQueue() {
        System.out.println("Hapus Antrian");
        System.out.print("Masukkan Nama: ");
        String nama = sc.next();
        
        boolean found = false;

        for (int i = 0; i < queue.length; i++) {
            if (queue[i][0] == null) {
                // Antrian Kosong, skip to the next iteration
                continue;
            } else if (queue[i][0].equals(nama)) {
                // Nama ditemukan, hapus antrian
                queue[i][0] = null;
                queue[i][1] = null;
                queue[i][2] = null;
                found = true;
                System.out.println("Antrian Berhasil Dihapus");
                break;
            }
        }

        if (!found) {
            System.out.println("Antrian dengan nama " + nama + " tidak ditemukan");
        }

        goBack();
    }

    private static void viewQueue() {
        
        System.out.println();
        System.out.println("============================================");
        System.out.println("=              Daftar Antrian              =");
        System.out.println("============================================");
        for (int i = 0; i < queue.length; i++) {
             if (queue[i][0] == null) {
                continue;
            }

            System.out.println("Nama: " + queue[i][0]);
            System.out.println("Status: " + queue[i][1] + "\n");
           
        }

        goBack();
    }


    private static void callQueue() {

        boolean queueCalled = false;

        while (queueNumberNow < queueNumberMax && isQueueEmpty(queueNumberNow)) {
            queueNumberNow++;
        }
    
        for (int i = 0; i < queue.length; i++) {
            if (queue[i][0] == null) {
                // System.out.println("Antrian Kosong");
                continue;
            } else if (queue[i][2].equals(Integer.toString(queueNumberNow))) {
                System.out.println("Nama: " + queue[i][0] + " dipanggil!");
                queue[i][0] = null;
                queue[i][1] = null;
                queue[i][2] = null;
                queueCalled = true;
                break;
            }
        }
    
        if (!queueCalled) {
            System.out.println("Antrian Kosong");
        }
    
        // Move to the next valid queue number
        
    
        goBack();
    }

    
    private static boolean isQueueEmpty(int queueNumber) {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i][2] != null && queue[i][2].equals(Integer.toString(queueNumber))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isQueueFull() {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i][0] == null) {
                return false;
            }
        }
        return true;
    }

    private static void goBack() {
        System.out.println();
        System.out.print("Ketik b untuk kembali ke menu utama (b)");
        String back = sc.next();
        if (back.equals("b")) {
            selectMenu();   
        }else{
            goBack();
        }
    }
}