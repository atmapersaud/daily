package atmanode;

public class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node<String> n1 = new Node<String>("what's up yo");
        Node<String> n2 = new Node<String>("not much, brotha");
        n1.next = n2;
        System.out.println(n1.data);
        System.out.println(n1.next.data);
    }
}
