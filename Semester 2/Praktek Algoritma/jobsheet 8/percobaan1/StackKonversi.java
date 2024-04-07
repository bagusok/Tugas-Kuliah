package percobaan1;

public class StackKonversi {
    int size;
    int[] tumpukanBiner;
    int top;

    StackKonversi(int kapasitas) {
        size = kapasitas;
        tumpukanBiner = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Tumpukan penuh, data tidak bisa ditambahkan");
        } else {
            tumpukanBiner[++top] = data;
            System.out.println("Data " + data + " berhasil ditambahkan");
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong, tidak ada data yang bisa diambil");
            return 0;
        } else {
            int temp = tumpukanBiner[top--];
            System.out.println("Data " + temp + " berhasil diambil");
            return temp;
        }
    }

    void print() {
        System.out.println("Isi tumpukan: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(tumpukanBiner[i]);
        }
    }
}
