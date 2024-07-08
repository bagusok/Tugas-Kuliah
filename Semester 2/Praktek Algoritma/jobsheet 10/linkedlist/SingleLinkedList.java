package linkedlist;

public class SingleLinkedList {
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addFirst(int data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(int key, int input){
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key not found");
        } else {
            Node newNode = new Node(input, temp.next);
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) {
                tail = newNode;
            }
        }
    }

    void insertAt(int index, int input) {
        Node ndInput = new Node();
        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index out of bound");
                    return;
                }
                temp = temp.next;
            }
            ndInput.data = input;
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (temp == tail) {
                tail = ndInput;
            }
        } else if (index == 0) {
            ndInput.data = input;
            ndInput.next = head;
            head = ndInput;
            if (tail == null) {
                tail = ndInput;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);

            if(temp.next.next == null){
                tail = temp.next;
            }

            System.out.println("Invalid index");
        }
    }

    int getData(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                System.out.println("Index out of bound");
                return -1;
            }
            temp = temp.next;
        }
        return temp.data;
    }

    int indexOf(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == key) {
            removeFirst();
            return;
        }
        if (tail.data == key) {
            removeLast();
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Key not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index out of bound");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Index out of bound");
                return;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }


    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.print();
        sll.addFirst(890);
        sll.print();
        sll.addLast(760);
        sll.print();
        sll.addFirst(700);
        sll.print();
        sll.insertAfter(700, 999);
        sll.print();
        sll.insertAt(3, 833);
        sll.print();

        System.out.println("Data pada index ke-1=" + sll.getData(1));
        System.out.println("Data ke 3 ada di " + sll.indexOf(760));

        sll.remove(999);
        sll.print();
        sll.removeAt(0);
        sll.print();
        sll.removeFirst();
        sll.print();
        sll.removeLast();
        sll.print();
    }

}
