
// Node Untuk Transaksi Rental
class NodeTransaksi {
    TransaksiRental data;
    NodeTransaksi next, prev;

    NodeTransaksi(NodeTransaksi prev, TransaksiRental data, NodeTransaksi next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    NodeTransaksi(){}
}
