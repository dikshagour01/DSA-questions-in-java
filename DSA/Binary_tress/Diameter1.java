public class Diameter1{
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHt= height(root.left);
        int rightHt= height(root.right);
        return Math.max(leftHt,rightHt)+1;
    }

    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }

        int LeftDiam=Diameter(root.left);
        int leftHt=height(root.left);
        int RightDiam=Diameter(root.right);
        int rightHt=height(root.right);

        int selfDiam=leftHt+rightHt+1;
        return Math.max(selfDiam, Math.max(LeftDiam,RightDiam));
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Diameter(root));
    }
}