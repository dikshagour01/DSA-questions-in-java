public class linkedList3{
        public class Node{
        int data;
        Node next;  
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int size=0;
    public static Node head;
    public static Node tail;

    //+++++++++++++++++++++++++++++ method to add node at first in LL+++++++++++++++++++++

    public void addFirst(int data){
        // STEP1 = Create a new node 
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // STEP2 = newnode next= head
        newNode.next=head;

        //STEP = 3 head=newNode
        head=newNode;

    }

    //+++++++++++++++++++++++++++++ method to add node at last in LL+++++++++++++++++++++

    public void addLast(int data){
        // STEP1 = Create a new node 
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // STEP2 = tail next= newNode
        tail.next=newNode;

        //STEP = 3 tail=newNode
        tail=newNode;

    }

    //+++++++++++++++++++++++++++++ method to add node at last in LL+++++++++++++++++++++
    
    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp  != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //+++++++++++++++++++++++++++++ method to detect cycle in a LL+++++++++++++++++++++
    public static boolean detectCycle(){
    
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    //+++++++++++++++++++++++++++++ method to remove a cycle in a LL+++++++++++++++++++++
    public static void removeCycle(){
        // Detect a cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle-> last.next=null
        prev.next=null;
    }

      public static void main(String args[])
    {
        linkedList3 ll = new linkedList3();
        ll.head = ll.new Node(1);
        Node temp = ll.new Node(2);
        ll.head.next=temp;
        ll.head.next.next=ll.new Node(3);
        ll.head.next.next.next = temp;
        System.out.println(ll.detectCycle());
        ll.detectCycle();
        System.out.println(ll.detectCycle());

        
    }
    
}