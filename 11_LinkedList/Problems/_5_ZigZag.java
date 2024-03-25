public class _5_ZigZag {
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

    public static Node zigZag(Node head) {
        // Find the middle
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
        }
        Node middle = slow;
        Node right = middle.next;
        middle.next = null;

        // reverse the other half
        Node prev = null, curr = right, nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        right = prev; 
        
        Node left = head;
        Node nextLeft, nextRight;
        while (left != null && right != null) {
            nextLeft = left.next;
            nextRight = right.next;
            left.next = right;  
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printList(head);
        head = zigZag(head);
        printList(head);
    }    
}
