package Binarytree;
// using recursion

class Node {
    int data;
    Node left,Node right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (int i = 1; i <= h; i++) {
            printCurrentlvl(root, i);
        }
    }

    int height(Node root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (left > right) {
            return (left + 1);
        } else {
            return (right + 1);
        }
    }

    void printCurrentlvl(Node root, int lvl) {
        if (root == null)
            return;
        if (lvl == 1) {
            System.out.println(root.val);
        } else {
            printCurrentlvl(root.left, lvl - 1);
            printCurrentlvl(root.right, lvl + 1);
        }
    }

}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.printlvlOrder();
        // T.C --> O(N)-skewed tree
        // O(logn) - Balanced tree
}

// using queue

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    Node root;

    void printLevelOrder() {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node tmpNode = q.poll();
            System.out.println(tmpNode.data + " ");
            if (tmpNode.left != null) {
                q.add(tmpNode.left);
            }
            if (tmpNode.right != null) {
                q.add(tmpNode.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.printlevelOrder();
    }
    // T.C --> O(N)
    // S.C --> O(N)
}
