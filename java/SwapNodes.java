import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SwapNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Node root = new Node(1, 1);
        LinkedList<Node> nodeQ = new LinkedList<Node>();      
        HashMap<Integer, LinkedList<Node>> depthMap = new HashMap<Integer, LinkedList<Node>>();

        nodeQ.add(root);
        depthMap.put(1, new LinkedList<Node>());
        depthMap.get(1).add(root);

        for (int i = 0; i < N; i++) {            
            Node curr = nodeQ.remove();
            int newDepth = curr.depth + 1;
            if (!depthMap.containsKey(newDepth)) depthMap.put(newDepth, new LinkedList<Node>());
            int lt = sc.nextInt();
            int rt = sc.nextInt();

            if (lt != -1) {
                curr.left = new Node(lt, newDepth);
                depthMap.get(newDepth).add(curr.left);                
                nodeQ.add(curr.left);
            }
            if (rt != -1) {
                curr.right = new Node(rt, newDepth);
                depthMap.get(newDepth).add(curr.right);
                nodeQ.add(curr.right);
            }
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            int currDepth = K;
            while (depthMap.containsKey(currDepth)) {
                for (Node n : depthMap.get(currDepth)) {
                    Node temp = n.left;
                    n.left = n.right;
                    n.right = temp;
                }
                currDepth += K;
            }
            root.printTree();
            System.out.println();
        }
    }
}

class Node {
    Node left;
    Node right;
    int data;
    int depth;
    Node(int data, int depth) {
        this.data = data;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }
    void printTree() {
        if (this.left != null) this.left.printTree();
        System.out.print(data + " ");
        if (this.right != null) this.right.printTree();
    }
}
