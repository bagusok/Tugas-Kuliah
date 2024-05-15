public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();

        System.out.println("Data dari belakang");
        dll.printFromTail();
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split

        System.out.println("Data Sebelum ditambah add last");
        dll.print();
        
        System.out.println("Data Setelah ditambah add last");
        dll.addLast(155);
        dll.addLast(11);
        dll.addLast(13);
        dll.print();

        System.out.println();

        // TEST MERGE
        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.addLast(1);
        dll1.addLast(2);
        dll1.addLast(3);
        System.out.println("Data dll1");
        dll1.print();

        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addLast(4);
        dll2.addLast(5);
        dll2.addLast(6);
        System.out.println("Data dll2");
        dll2.print();

        System.out.println("setelah di merge");
        merge(dll1, dll2);


        
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        dll1.tail.n = dll2.head;
        dll1.tail = dll2.tail;
        dll1.size += dll2.size;

        dll2.head.p = dll1.tail;
        dll2.head = dll1.head;
        dll2.size = dll1.size;


        System.out.println("Data dll1 dan dll2 setelah di merge, print dari dll1");
        dll1.print();
        System.out.println("Data dll1 dan dll2 setelah di merge, print dari dll2");
        dll2.print();

    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
