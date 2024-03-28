public class linkedList{
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

    //+++++++++++++++++++++++++++++ method to print a LL+++++++++++++++++++++
    
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


    //+++++++++++++++++++++++++++++ method to add node at middle of LL+++++++++++++++++++++

    public void addMiddle(int idx, int data){
        // corner case
        if(idx==0){
            addFirst(data);
            return;
        }
        // STEP1 = Create a new node 
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i = idx-1 yaha temporary = previous node hoga
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //+++++++++++++++++++++++++++++ method to remove node from first of LL +++++++++++++++++++++
    public void removeFirst(){
        head=head.next;
        size--;
    }
    
    //+++++++++++++++++++++++++++++ jise bhi delete kiya hai use return karvana hai to +++++++++++++++++++++
    public int remove_First(){
         if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //+++++++++++++++++++++++++++++ method to remove node from last of LL +++++++++++++++++++++

    public int removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // previous = size-2;

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String args[])
{
    linkedList ll = new linkedList();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.printLL();
    ll.addMiddle(3,10);
    ll.printLL();
    ll.removeFirst();
    ll.printLL();
    ll.removeLast();
    ll.printLL();
    System.out.println(ll.size);
}
}

