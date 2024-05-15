package vaksin;

class Node {
    Orang data;
    Node next, prev;

    Node(Node prev, Orang data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node(){}
}
