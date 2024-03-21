public class _4_MergeSortOnLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node left, Node right) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;    
        }
        Node middle = findMiddle(head);
        Node rightHead = middle.next;
        middle.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        return merge(left, right);
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(20);
        head.next.next = new Node(90);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printList(head);
        head = mergeSort(head);
        printList(head);
    }    
}
