package film;

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

    void addFirst(Film data) {
        Node newNode = new Node(null, data, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        size++;

        System.out.println("Film " + data.judul + " telah ditambahkan");
    }

    void addLast(Film data) {
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
        System.out.println("Film " + data.judul + " telah ditambahkan");
    }

    void add(Film data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bound");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, data, current.next);
            current.next = newNode;
            current.next.prev = newNode;
            size++;
        }

        System.out.println("Film " + data.judul + " telah ditambahkan pada index " + index);

    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.println(current.data.id + " " + current.data.judul + " " + current.data.rating);
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty");
        }
        System.out.println();
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
           removeLast();
        } else {
            System.out.println(head.data.judul + " telah dihapus");
            head = head.next;
            head.prev = null;
            size--;
        }
        
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
            System.out.println(head.data.judul + " telah dihapus");
            head = null;
            size--;
        } else {
            System.out.println(head.data.judul + " telah dihapus");
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    void remove(int index) {
        if (isEmpty()|| index >= size) {
            System.out.println("Index out of bound");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
          
            if (current.next.next == null) {
                removeLast();
            } else if(current.prev == null) {
                removeFirst();
            } else {
                current.next = current.next.next;
                current.next.prev = current;
                size--;
            }
        }
    }
    
    Film searchFilm(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    void sortByDesc() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                if (current.data.rating < next.data.rating) {
                    Film temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();

        // Tambah Data Awal
        System.out.println("Menambahkan Film");
        dll.addFirst(new Film(1, "The Shawshank Redemption", 8.3));
        dll.print();

        // Tambah Data di Akhir
        System.out.println("Menambahkan Film Pada Index Akhir");
        dll.addLast(new Film(2, "The Godfather", 9.2));
        dll.addLast(new Film(3, "The Dark Knight", 3));
        dll.addLast(new Film(5, "The Lord of the Rings: The Return of the King", 6));
        dll.print();

        // Tambah Data di Tengah
        System.out.println("Menambahkan Film Pada Index 1");
        dll.add(new Film(4, "The Lord of the Rings: The Return of the King", 7), 1);
        dll.print();

        // Hapus Data Awal
        System.out.println("Menghapus Film Pada Index Awal");
        dll.removeFirst();
        dll.print();

        // Hapus Data di Akhir
        System.out.println("Menghapus Film Pada Index Akhir");
        dll.removeLast();
        dll.print();

        // Hapus Data di Tengah
        System.out.println("Menghapus Film Pada Index 2");
        dll.remove(2);
        System.out.println();

        // Search Film By ID
        System.out.println("Mencari Film Berdasarkan ID = 4");
        System.out.println(dll.searchFilm(4).judul);
        System.out.println();

        

        // Sort By Rating Descending

        // Sebelum SOrt
        // System.out.println("Sebelum Sort");
        // dll.print();

        // // Setelah Sort
        // System.out.println("Sort By Rating Descending");
        // dll.sortByDesc();
        // dll.print();

    }

}
