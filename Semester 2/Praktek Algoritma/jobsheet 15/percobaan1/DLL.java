package percobaan1;


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

    void addFirst(int data, int jarak) {
        if (!isEmpty()) {
            Node newNode = new Node(null, data, jarak, head);
            head.prev = newNode;
            head = newNode;
        } else {
            head = new Node(null, data, jarak, null);
        }
        size++;
    }

    // void addLast(int data) {
    //     if (isEmpty()) {
    //         addFirst(data);
    //     } else {
    //         Node current = head;
    //         while (current.next != null) {
    //             current = current.next;
    //         }
    //         Node newNode = new Node(current, data, null);
    //         current.next = newNode;
    //         size++;
    //     }
    // }

    // void add(int data, int index) {
    //     if (index < 0 || index > size) {
    //         System.out.println("Index out of bound");
    //     } else if (index == 0) {
    //         addFirst(data);
    //     } else {
    //         Node current = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             current = current.next;
    //         }
    //         Node newNode = new Node(current, data, current.next);
    //         current.next = newNode;
    //         current.next.prev = newNode;
    //         size++;
    //     }
    // }

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
     Node current = head;
     while (current != null) {
        if (current.data == index) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            size--;
            break;
        }
        current = current.next;
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


    int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Index out of bound");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.jarak;
        }
    }
    
    void setJarak(int index, int newJarak) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index out of bound");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.jarak = newJarak;
        }
    }
}
