package film;

class Node {
    Film data;
    Node next, prev;

    Node(Node prev, Film data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node(){}
}