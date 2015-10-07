import java.lang.Math;

public class Node<T> {
    Node left;
    Node right;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public void traverse() {
        System.out.print(data);
        if (left != null) left.traverse();
        if (right != null) right.traverse();
    }

    public int height(int depth) {
        if (left == null && right == null) return depth;
        int newDepth = depth + 1;
        if (left == null) return right.height(newDepth);
        if (right == null) return left.height(newDepth);
        return Math.max(right.height(newDepth), left.height(newDepth));
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(3);
        Node<Integer> n2 = new Node<Integer>(4);
        Node<Integer> n3 = new Node<Integer>(5);
        Node<Integer> n4 = new Node<Integer>(2);
        Node<Integer> n5 = new Node<Integer>(6);
        Node<Integer> n6 = new Node<Integer>(1);
        Node<Integer> n7 = new Node<Integer>(7);
        Node<Integer> n8 = new Node<Integer>(8);
        Node<Integer> n9 = new Node<Integer>(9);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;
        n4.right = n6;
        n5.left = n7;
        n6.left = n8;
        n6.right = n9;
        System.out.println(n1.height(0));
        n1.traverse();
    }
}
