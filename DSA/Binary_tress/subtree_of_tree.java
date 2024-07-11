public class subtree_of_tree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        }
        if (node == null || subroot == null) {
            return false;
        }
        if (node.data != subroot.data) {
            return false;
        }

        return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
    }

    public static Boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (subroot == null) {
            return true;
        }
        if (isIdentical(root, subroot)) {
            return true;
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // subtree
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isSubtree(root, subroot));  // Output: true
    }
}
