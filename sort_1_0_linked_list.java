class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
}

public class sort_1_0_linked_list {

    public static void sortList(Node head) {
        int cnt[] = { 0, 0, 0 };
        Node ptr = head;
        while (ptr != null) {
            cnt[ptr.data]++;
            ptr = ptr.next;
        }
        int idx = 0;
        Node p2 = head;
        while (p2 != null) {
            if (cnt[idx] == 0)
                idx++;
            else {
                p2.data = idx;
                cnt[idx]--;
                p2 = p2.next;
            }
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.print("Linked List before Sorting:");
        printList(head);

        // Function to sort the linked list
        sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
