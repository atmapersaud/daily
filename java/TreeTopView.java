void top_view(Node root) {
    LinkedList<Node> nodeSQ = new LinkedList<Node>();

    Node curr = root;

    while (curr != null) {
	nodeSQ.add(curr.data);
	curr = curr.left;
    }
    
    while (!nodeSQ.isEmpty()) System.out.print(nodeSQ.removeLast() + " ");

    curr = root.right;

    while (curr != null) {
	nodeSQ.add(curr.data);
	curr = curr.right;
    }

    while (!nodeSQ.isEmpty()) System.out.print(nodeSQ.remove() + " ");
}
