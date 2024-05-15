package vaksin;

public class DLL {
    Node head;
    int size;

    DLL() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Orang data) {
        Node newNode = new Node(null, data, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    void addLast(Orang data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
        System.out.println("Penerima Vaksin " + data.nama + " telah ditambahkan");
    }

    int size() {
        return size;
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.println(current.data.no + " " + current.data.nama );
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(head.data.nama + " telah dihapus");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
            System.out.println(head.data.nama + " telah dihapus");

            head = null;
            size--;
        } else {
            System.out.println(head.data.nama + " telah dihapus");
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }


    public static void main(String[] args) {
        DLL dll = new DLL();

        // Tambah Penerima Vaksin
        dll.addLast(new Orang(123, "Joko"));
        dll.addLast(new Orang(124, "Mely"));
        dll.addLast(new Orang(135, "Johan"));
        dll.addLast(new Orang(146, "Rosi"));
        System.out.println();
        
        // Tampilkan List Penerima Vaksin
        System.out.println("List Penerima Vaksin");
        dll.print();
        System.out.println("Size: " + dll.size());

        System.out.println();
        
        // Hapus Penerima Vaksin
        dll.removeFirst();
        
        System.out.println();
        // Tampilkan List Penerima Vaksin
        System.out.println("List Penerima Vaksin");
        dll.print();
        System.out.println("Size: " + dll.size());
    }
}
