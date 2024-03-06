package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {
    String nim, nama;
    char jenisKelamin;
    double ipk;

    public Mahasiswa(String nim, String nama, char jenisKelamin, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumIpk = 0;
        double topIpk = 0;

        Mahasiswa[] mhsArray = new Mahasiswa[3];

        for(int i = 0; i < mhsArray.length; i++) {
            System.out.println("Mahasiswa ke-" + i);
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Jenis Kelamin: ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            sumIpk += ipk;
            if (ipk > topIpk) {
                topIpk = ipk;
            }


            mhsArray[i] = new Mahasiswa(nim, nama, jenisKelamin, ipk);
        }


        for (Mahasiswa m: mhsArray) {

            System.out.println("NIM: " + m.nim);
            System.out.println("Nama: " + m.nama);
            System.out.println("Jenis Kelamin: " + m.jenisKelamin);
            System.out.println("IPK: " + m.ipk);

            if (m.ipk == topIpk) {
                System.out.println("Mahasiswa ini memiliki IPK tertinggi");
            }

            System.out.println("----------------------");
        }

        System.out.println("Rata-rata IPK kelas: " + sumIpk / mhsArray.length);

    

        sc.close();
    }
}
