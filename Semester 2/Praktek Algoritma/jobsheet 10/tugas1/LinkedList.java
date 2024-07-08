package tugas1;

public class LinkedList {

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.nama + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addLast(Mahasiswa data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(data.nama + " Masuk Antrian");
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        System.out.println(head.data.nama + " Dipanggil");
        head = head.next;
        if (head == null) {
            tail = null;
        }
        
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Menambah Antrian
        list.addLast(new Mahasiswa("Anton", 111));
        list.addLast(new Mahasiswa("Prita", 124));
        list.addLast(new Mahasiswa("Yusuf", 124));
        list.addLast(new Mahasiswa("Doni", 124));
        list.addLast(new Mahasiswa("Sari", 124));
        System.out.println();

        System.out.println("Antrian saat ini : ");
        list.print();

        // Memanggil Antrian
        list.removeFirst();
        list.removeFirst();

        System.out.println();
        System.out.println("Antrian saat ini : ");
        list.print();
       
    }

}
