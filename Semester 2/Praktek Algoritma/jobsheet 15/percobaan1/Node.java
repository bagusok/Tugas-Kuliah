package percobaan1;

class Node {
    int data, jarak;
    Node next, prev;

    Node(Node prev, int data, int jarak, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }

    Node(){}
}