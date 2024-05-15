public class Node {
    int data;
    Node n;
    Node p;
    
    Node(){
        data=0;
        n = p = null;
    }
    
    Node(int data){
        this.data = data;
        n = p = null;
    }
    
    Node(Node prev, int data, Node next){
        this.data = data;
        this.n = next;
        this.p = prev;
    }
    
}
