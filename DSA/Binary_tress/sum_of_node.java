public class sum_of_node{
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

    public static int SumofNode(Node root){
        if(root==null){
            return 0;
        }

        int leftSum= SumofNode(root.left);
        int RightSum= SumofNode(root.right);
        return leftSum+RightSum+root.data;
    }

    public static void main(String args[]){


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(SumofNode(root));
    }
}