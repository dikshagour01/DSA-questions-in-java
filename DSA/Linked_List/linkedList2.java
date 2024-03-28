//+++++ ITERATIVE SEARCH IN LINKEDLIST ++++++++++++

public class linkedList2{
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

    //+++++++++++++++++++++++++++++ method to search a key in LL through iteration +++++++++++++++++++++

    public int iterativeSearch(int key){
        Node temp = head;
        int idx=0;
        while(temp != null){
            if(temp.data==key)
            {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        
        return -1;  //key not found
    }

    //+++++++++++++++++++++++++++++ method to search a key in LL through recursion +++++++++++++++++++++
    public int helper(int key, Node head){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int idx = helper(key,head.next);
        if(idx==-1){
            return -1;
        }

        return idx+1;

    }
    public int recursionSearch(int key){
        return helper(key,head);
    }

    //+++++++++++++++++++++++++++++ method to reverse a LL +++++++++++++++++++++
    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //+++++++++++++++++++++++++++++ method to reverse a LL +++++++++++++++++++++
    public void removeNthEnd(int n){
        Node temp=head;
        int size=0;
        while(temp != null){
            temp=temp.next;
            size++;
        }

        // Corner Case if head ko delete karna hai
        if(n==size){
            head=head.next;
            return;
        }

        int i=1;
        int sizeMinusN = size-n;
        Node prev=head;
        while(i<sizeMinusN){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //+++++++++++++++++++++++++++++ check if LL is Pallindrome +++++++++++++++++++++

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        if(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }

    public boolean Pallindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1- find mid
        Node midNode = findMid(head);

        //step 2- reverse second half of LL
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //step 3- check left half & right half
        Node right=prev; //right half ka head
        Node left=head;
        while(right != null){
            if(left.data!=right.data){
                return false;
            }

            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String args[]){
        linkedList2 ll = new linkedList2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        // System.out.println(ll.iterativeSearch(4));
        // System.out.println(ll.iterativeSearch(10));
        // System.out.println(ll.recursionSearch(4));
        // System.out.println(ll.recursionSearch(10));
        // ll.reverseLL();
        // ll.printLL();
        // ll.removeNthEnd(3);
        // ll.printLL();
        System.out.println(ll.Pallindrome());

    }
}