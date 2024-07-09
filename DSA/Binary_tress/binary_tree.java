public class binary_tree {
    static class Node {  // created a node class
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {  // class for binary tree
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Pre Order Traversal in a Binary Tree
        public static void Preorder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
        

        // in order traversal in binary tree
        public static void Inorder(Node root){
            if(root==null){
                return;
            }

            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);
        }

        // post order traversal in binary tree
        public static void Postorder(Node root){
            if(root==null){
                return;
            }

            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+ " ");
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        // Print root node of binary tree
        Node root = tree.buildTree(nodes);
        System.out.println("Root node data: " + root.data);

        // print preorder of tree
        tree.Preorder(root);
        System.out.println();

        // print Ineorder of tree
        tree.Inorder(root);
        System.out.println();

        // print Posteorder of tree
        tree.Postorder(root);
        
    }
}
