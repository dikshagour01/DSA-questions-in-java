public class queue_LL{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head=null;
    static Node tail=null;

    static class queue{
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }

            // first element of queue
            if(head==null){
                head=tail=newNode;
            }

            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            return head.data;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
   
}