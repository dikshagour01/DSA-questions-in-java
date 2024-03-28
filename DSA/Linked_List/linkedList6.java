// Doubly linked list

public class linkedList6{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size=0;


    //+++++++++++++++++++++++ ADD NEW NODE AT FIRST OF DOUBLY LINKED LIST +++++++++++++++

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //+++++++++++++++++++++++ PRINT A DOUBLY LINKED LIST +++++++++++++++

    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     
    //+++++++++++++++++++++++ REMOVE FIRST NODE FROM A DOUBLY LINKED LIST +++++++++++++++

    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1 || head.next==null){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //+++++++++++++++++++++++ ADD NODE AT LAST IN DOUBLY LINKE DLIST +++++++++++++++++

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    //+++++++++++++++++++++++ REMOVE NODE AT LAST IN DOUBLY LINKE DLIST +++++++++++++++++

    public int removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1 || head.next==null){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    //+++++++++++++++++++++++ REVERSE A DOUBLY LINKE DLIST +++++++++++++++++
    public void reverseDLL(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }

        head=prev;
    }

    public static void main(String args[]){
        linkedList6 dll = new linkedList6();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);
        dll.reverseDLL();
        dll.print();

    }
}