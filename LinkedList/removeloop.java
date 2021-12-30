package LinkedList;

class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void detectloop(Node node) {
        if (node == null || node.next == null)
            return null;

        Node slow = node;
        Node fast = node;

        slow = slow.next;
        fast = fast.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // cycle
        if (slow == fast) {
            slow = node;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        } else {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}