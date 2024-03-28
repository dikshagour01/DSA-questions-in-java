// merge sort using linked list
//zig-zag linkedlist

public class linkedList5{
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

    public Node mergeSort(Node head){
        //base case
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node midNode = getmid(head);

        //left & right half
        Node rightHead = midNode.next;
        midNode.next=null;
        Node newLeft =mergeSort(head);
        Node newRight =mergeSort(rightHead);

        //merge both half
        return merge(newLeft,newRight);
    }

    public Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1 != null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2 != null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergeLL.next;
    }

    public void zigzag(){
        // find mid
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        //reverse second half of LL
        Node curr=mid.next;
        mid.next=null;
        Node prev= null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //zig zag arrange karna hai LL ko alternate add karna left half and second half se
        Node left=head;
        Node right=prev;
        Node nextL;
        Node nextR;
        while(left != null && right != null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public static void main(String args[]){
        linkedList5 ll = new linkedList5();
        ll.addFirst(4);
        ll.addFirst(1);
        ll.addLast(8);
        ll.addLast(3);
        ll.printLL();
        // ll.head=ll.mergeSort(ll.head);
        // ll.printLL();
        ll.zigzag();
        ll.printLL();

    }

}