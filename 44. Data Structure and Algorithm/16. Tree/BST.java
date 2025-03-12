class BST {
    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private Node root; // Root of BST

    // Insert a value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (root.data == value) return true;
        return value < root.data ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    // Delete a value from the BST
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) return root;
        
        if (value < root.data) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.data) {
            root.right = deleteRec(root.right, value);
        } else {
            // Case 1: Node with only one child or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 2: Node with two children - get inorder successor (smallest in right subtree)
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minV = root.data;
        while (root.left != null) {
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    // InOrder Traversal (Left-Root-Right)
    public void inOrderTraversal() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // PreOrder Traversal (Root-Left-Right)
    public void preOrderTraversal() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // PostOrder Traversal (Left-Right-Root)
    public void postOrderTraversal() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Main method to test the BST
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("InOrder Traversal (Sorted):");
        tree.inOrderTraversal();

        System.out.println("PreOrder Traversal:");
        tree.preOrderTraversal();

        System.out.println("PostOrder Traversal:");
        tree.postOrderTraversal();

        // Search elements
        System.out.println("Search 40: " + tree.search(40)); // true
        System.out.println("Search 90: " + tree.search(90)); // false

        // Delete node
        System.out.println("Deleting 30...");
        tree.delete(30);
        tree.inOrderTraversal();
    }
}
