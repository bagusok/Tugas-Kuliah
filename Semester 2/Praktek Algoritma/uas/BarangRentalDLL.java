public class BarangRentalDLL {
    Node head;
    int size;

    
    BarangRentalDLL() {
        head = null;
        size = 0;
    }

    // cek apa list kosong
    boolean isEmpty() {
        return head == null;
    }

    // Menambahkan data di awal list
    void addFirst(BarangRental data) {
        Node newNode = new Node(null, data, head);

        // cek dulu apakah list kosong
        if (!isEmpty()) {
            // jika tidak, maka node baru akan diisi dengan node head
            head.prev = newNode;
        }
        // jika iya head akan diisi dengan node baru
        head = newNode;
        size++;
    }

    // Menambahkan data di akhir list
    void addLast(BarangRental data) {

        // cek dulu apakah list kosong
        if (isEmpty()) {
            // jika iya maka data akan ditambahkan di awal list dengan method addFirst
            addFirst(data);
        } else {
            // jika tidak, maka akan dilakukan iterasi sampai node terakhir
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // node baru akan diisi dengan data dan node current akan diisi dengan node baru
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
        System.out.println("Kendaraan " + data.namaKendaraan + " telah ditambahkan");
    }


    // Menampilkan semua data dengan looping dari head sampai null
    void print() {
        Node current = head;
        while (current != null) {
            System.out.println("No TNKB: " + current.data.noTNKB);
            System.out.println("Nama Kendaraan: " + current.data.namaKendaraan);
            System.out.println("Jenis Kendaraan: " + current.data.jenisKendaraan);
            System.out.println("Tahun Kendaraan: " + current.data.tahun);
            System.out.println("Harga Sewa: " + current.data.biayaSewa);
            System.out.println();
            current = current.next;
        }
    
    }

    // Mencari data berdasarkan noTNKB
    BarangRental searchByTNKB(String noTNKB) {
        Node current = head;
        // iterasi sampai data yang dicari ditemukan
        while (current != null) {

            // jika data yang dicari ditemukan maka akan dikembalikan
            if (current.data.noTNKB.equalsIgnoreCase(noTNKB)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
}
