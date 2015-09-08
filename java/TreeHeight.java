int height(Node root) {
    LinkedList<Node> nodeQ = new LinkedList<Node>();
    LinkedList<Integer> depthQ = new LinkedList<Integer>();

    Node curr;
    int depth;
    int maxDepth = 0;

    nodeQ.add(root);
    depthQ.add(1);

    while (!nodeQ.isEmpty()) {
	curr = nodeQ.remove();
	depth = depthQ.remove();
	if (depth > maxDepth) maxDepth = depth;

	if (curr.left != null) {
	    nodeQ.add(curr.left);
	    depthQ.add(depth + 1);
	}

	if (curr.right != null) {
	    nodeQ.add(curr.right);
	    depthQ.add(depth + 1);
	}
    }

    return maxDepth;
}

