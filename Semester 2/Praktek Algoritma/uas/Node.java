
// Node Untuk Barang Rental
class Node {
    BarangRental data;
    Node next, prev;

    Node(Node prev, BarangRental data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node(){}
}
