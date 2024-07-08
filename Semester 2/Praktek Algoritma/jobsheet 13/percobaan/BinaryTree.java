package percobaan;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        }else{
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (data<current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new Node(data);
                        return;
                    }
                }else{
                    current = current.right;
                    if (current == null) {
                        parent.right = new Node(data);
                        return;
                    }
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            }else if (data<current.data) {
                current = current.left;
            }else if (data>current.data) {
                current = current.right;
            }
        }
        return result;
    }

    void transversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    void transversePostOrder(Node node) {
        if (node != null) {
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void transverseInOrder(Node node) {
        if (node != null) {
            transverseInOrder(node.left);
            System.out.print(node.data + " ");
            transverseInOrder(node.right);
        }
    }


    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            }else if (data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (data>current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }else{
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }


    boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    void countLeaf(Node node) {
        if (node != null) {
            if (isLeaf(node)) {
                System.out.print(node.data + " ");
            }
            countLeaf(node.left);
            countLeaf(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        System.out.println("PreOrderTv: ");
        bt.transversePreOrder(bt.root); 
        System.out.println();
        System.out.println("InOrder: ");
        bt.transverseInOrder(bt.root);
        System.out.println();
        System.out.println("PostOrder: ");
        bt.transversePostOrder(bt.root);
        System.out.println();
        System.out.println("Find 5: " + bt.find(5));
        System.out.println("delete 8");
        bt.delete(8);
        System.out.println();
        System.out.println("PreOrder: ");
        bt.transversePreOrder(bt.root);
        System.out.println();

        System.out.println("Leaf: ");
        bt.countLeaf(bt.root);

    }
}

