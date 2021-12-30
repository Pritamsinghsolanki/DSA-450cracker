package LinkedList;

//recursive
public static void reverse (Node root,Node ans){
    if(root==null) return;
    reverse(root.next);
    ans.next=root;
    ans=ans.next;
    return;
}
public static void main(String[] args){
    Node ans=new Node();
    reverse(root,ans);
    return ans.next;
}

//iterative
public static void reverse(Node root){
    Node prev=null;
    Node curr=root;
    Node next=null;
    
    while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
    }
    root=prev;
    return root;
}