class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node reverse(Node head,int k){
        if(head==null)
           return null;
        Node current=head;
        Node prev=null;
        Node next=null;

        int count=0;

        //first k reverse
        while(count<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next=reverse(next,k);
        }
        //T.C O(N)
        //S.C O(N/K)
        return prev;
    }
    }
}