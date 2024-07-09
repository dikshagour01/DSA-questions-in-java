public class Diameter2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Info {
        int ht;
        int diam;

        public Info(int diam, int ht) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static Info Diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Info result = Diameter(root);
        System.out.println("Diameter of the tree is: " + result.diam);
    }
}
