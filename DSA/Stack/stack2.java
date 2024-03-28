//+++++++++++++++++++++++++++++++ IMPLEMENTATION OF STACK USING LINKED LIST ++++++++++++++++++++++++++++

public class stack2{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack{
        static Node head=null;

        //++++++++++++++++ function to check whether stack is empty or not ++++++++++++++
        public static boolean isEmpty(){
            return head==null;
        }

        //++++++++++++++++ function to push a element in stack ++++++++++++++
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }

        //++++++++++++++++ function to pop a element from stack ++++++++++++++
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;
            return top;
        }

        //++++++++++++++++ function to peek a element from stack ++++++++++++++
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
            
        }

    } 

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}