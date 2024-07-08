package prak1;

public class DoubleLinkledList {
    Node head;
    int size;

    DoubleLinkledList() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        Node newNode = new Node(null, data, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    void addLast(int data) {
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
    }

    void add(int data, int index) {
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
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
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
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
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
    

    int getFirst() {
        if (isEmpty()) {
            return 0;
        } else {
            return head.data;
        }
    }

    int getLast() {
        if (isEmpty()) {
            return 0;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        }
    }

    int get(int index) {
        if (isEmpty() || index >= size) {
            return 0;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    public static void main(String[] args) {
        DoubleLinkledList dll = new DoubleLinkledList();

        // // Prak 1
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // dll.add(40, 1);
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // dll.clear();
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // // Prak 2
        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // dll.removeLast();
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // dll.remove(1);
        // dll.print();
        // System.out.println("Size: " + dll.size());

        // Prak 3
        dll.print();
        System.out.println("Size: " + dll.size());
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());

        dll.add(40, 1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("Data Awal: " + dll.getFirst());
        System.out.println("Data Akhir: " + dll.getLast());
        System.out.println("Data ke-1: " + dll.get(1));


        
    }

    
}
