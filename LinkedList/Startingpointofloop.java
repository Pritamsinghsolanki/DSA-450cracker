
static Node detectloop(Node head){
    if(head==null || head.next==null)
       return null;

    Node slow=head,fast=head;

    slow=slow.next;
    fast=fast.next.next;
    while(fast!=null && fast.next!=null){
        if(fast==slow) break;
        slow=slow.next;
        fast=fast.next.next;
    }
    if(slow!=fast) return null;

    slow=head;
    while(fast!=slow){
       fast=fast.next;
       slow=slow.next;
    }
    return slow;
}