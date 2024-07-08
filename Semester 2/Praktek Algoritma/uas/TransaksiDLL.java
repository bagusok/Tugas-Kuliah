public class TransaksiDLL {
    NodeTransaksi head;
    int size;

    
    TransaksiDLL() {
        head = null;
        size = 0;
    }

    // Untuk check apakah list kosong
    boolean isEmpty() {
        return head == null;
    }

    // Menambahkan data di awal list
    void addFirst(TransaksiRental data) {
        NodeTransaksi newNode = new NodeTransaksi(null, data, head);

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
    void addLast(TransaksiRental data) {
        // cek dulu apakah list kosong
        if (isEmpty()) {
            // jika iya maka data akan ditambahkan di awal list dengan method addFirst
            addFirst(data);
        } else {
            // jika tidak, maka akan dilakukan iterasi sampai node terakhir
            NodeTransaksi current = head;
            while (current.next != null) {
                current = current.next;
            }
            // node baru akan diisi dengan data dan node current akan diisi dengan node baru
            NodeTransaksi newNode = new NodeTransaksi(current, data, null);
            current.next = newNode;
            size++;
        }
        System.out.println("Transaksi " + data.kodeTransaksi+ " telah ditambahkan");
    }

    // Menampilkan semua data dengan looping dari head sampai null
    void print() {
        System.out.println("Data Seluruh Transaksi:");

        double totalKeuntungan = 0;

        NodeTransaksi current = head;
        while (current != null) {
            System.out.println("Kode Transaksi: " + current.data.kodeTransaksi);
            System.out.println("Lama Pinjam (jam): " + current.data.lamaPinjam);
            System.out.println("Nama Peminjam: " + current.data.namaPeminjam);
            System.out.println("No TNKB: " + current.data.br.noTNKB);
            System.out.println("Nama Kendaraan: " + current.data.br.namaKendaraan);
            System.out.println("Jenis Kendaraan: " + current.data.br.jenisKendaraan);
            System.out.println("Tahun Kendaraan: " + current.data.br.tahun);
            System.out.println("Harga Sewa: " + current.data.br.biayaSewa);
            System.out.println("Total Biaya: " + current.data.totalBiaya);
            System.out.println();
            totalKeuntungan += current.data.totalBiaya;
            current = current.next;
        }
        
        if (totalKeuntungan == 0){
            System.out.println("Belum ada transaksi yang dilakukan");
        }else{
            System.out.println("Total Keuntungan: " + totalKeuntungan);
        }
        System.out.println();
    }

    // Mengembalikan ukuran list
    int getSize() {
        return size;
    }

    // Mengurutkan data berdasarkan no TNKB
    void sortByNoTNKB() {
        NodeTransaksi current = head;
        NodeTransaksi index = null;
        TransaksiRental temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.br.noTNKB.compareTo(index.data.br.noTNKB) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // Mencari data berdasarkan no TNKB
    public BarangRental searchByTNKB(String noTNKB) {
        NodeTransaksi current = head;

        // Melakukan iterasi sampai node terakhir
        while (current != null) {
            // Jika data yang dicari ditemukan, maka akan dikembalikan
            if (current.data.br.noTNKB.equalsIgnoreCase(noTNKB)) {
                return current.data.br;
            }
            current = current.next;
        }
        // Jika tidak ditemukan, maka akan dikembalikan null
        return null;
    }
}
