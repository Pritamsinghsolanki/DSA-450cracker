package Binarytree;

//recursive same as lvl order just one line change

//Using dequeue+ stack
class BinaryTree {
    Node root;

    void reverseLevelOrder(Node root) {
        Stack<Node> S = new Stack();
        Queue<Node> Q = new LinkedList();
        Q.add(node);

        while (Q.isEmpty() == false) {
            node = Q.peek();
            Q.remove();
            S.push(node);
            if (node.left != null) {
                Q.push(node.left);
            }
            if (node.right != null) {
                Q.push(node.right);
            }
        }
        while (S.isEmpty() == false) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}