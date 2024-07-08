package percobaan;

public class BinaryTreeArr {
    int[] data;
    int idxLast;

    BinaryTreeArr() {
        data = new int[100];
        idxLast = -1;
    }

    boolean isEmpty() {
        return idxLast == -1;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;

    }
    
    void transverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            transverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            transverseInOrder(2*idxStart+2);
        }
    }


    void add(int item) {
        if (isEmpty()) {
            data[0] = item;
            idxLast = 0;
        } else {
            int idx = 0;
            while (true) {
                if (item < data[idx]) {
                    idx = 2 * idx + 1;
                    idxLast = idx;
                } else {
                    idx = 2 * idx + 2;
                    idxLast = idx;
                }
                if (data[idx] == 0) {
                    data[idx] = item;
                    idxLast = idx;
                    break;
                }
            }
        }
    }

    void transversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            transverseInOrder(2*idxStart+1);
            transverseInOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }

    void transversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            transverseInOrder(2*idxStart+1);
            transverseInOrder(2*idxStart+2);
        }
    }



    public static void main(String[] args) {
        BinaryTreeArr bt = new BinaryTreeArr();
        // int data[] = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        // int idxLats = 6;
        // bt.populateData(data, idxLats);
        // System.out.println("\nIn Order Traversal");
        // bt.transverseInOrder(0);
        // System.out.println();

        bt.add(10);
        bt.add(15);
        bt.add(99);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(8);
        bt.add(6);


        System.out.println("\nPost Order Traversal");
        // bt.transverseInOrder(0);
        bt.transversePostOrder(0);
        System.out.println();
        System.out.println("\nIn Order Traversal");
        bt.transverseInOrder(0);
        System.out.println();
        System.out.println("\nPre Order Traversal");
        bt.transversePreOrder(0);
        System.out.println();

    }

}
