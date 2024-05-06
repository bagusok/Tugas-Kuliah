package tugas;

import java.util.Scanner;

import prak1.Nasabah;

class Queue{
    Pembeli[] data;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        data = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    boolean isFull() {
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }else{
            return false;
        }
     }

    void enqueue(Pembeli dt){
        if (isFull()){
            System.out.println("Antrian penuh");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    Pembeli dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }else{
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }

        return dt;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama);
        }else{
            System.out.println("Antrian kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }else{

            int i = front;
            while(i != rear){
                System.out.print(data[i].nama + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[rear].nama);
        }else{
            System.out.println("Antrian kosong");
        }
    }   

    void peekPosition(String nama){
        if (!isEmpty()) {
            int i = front;
            int pos = 0;
            while(i != rear){
                if (data[i].nama.equals(nama)) {
                    System.out.println("Posisi " + nama + " ada di antrian ke-" + pos);
                    break;
                }
                i = (i + 1) % max;
                pos++;
            }
            if (data[i].nama.equals(nama)) {
                System.out.println("Posisi " + nama + " ada di antrian ke-" + pos);
            }
        }else{
            System.out.println("Antrian kosong");
        }
    }

    void daftarPembeli() {

        for(Pembeli n : data){
            System.out.println(n.nama);
        }
    }



    void menu() {
        System.out.println("Masukkan operasi yg diinnginkan");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Ambil Antrian");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Clear");
        System.out.println("===================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        int pilih;

        do{
            q.menu();
            pilih = sc.nextInt();
            
            switch (pilih) {
                case 1:
                    // System.out.println("Masukkan data: ");
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No. Hp: ");
                    int noHp = sc.nextInt();

                    // int dataMasuk = sc.nextInt();
                    q.enqueue(new Pembeli(nama, noHp));
                    break;
                case 2:
                    Pembeli dataKeluar = q.dequeue();
                    System.out.println("Data yg dikeluarkan: " + dataKeluar.nama);
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.daftarPembeli();
                    break;
                case 5:
                    q.clear();
                    break;
                default:
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);


    }
}