public class _2_FindAndRemoveNthNodeFromLinkedList {
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
    public static void deleteNthNode(Node head, int n) {
        // we won't be using the 'size' property, instead we will be calculating the size.
        Node currNode = head;
        int size = 0;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }

        if (size == n) {
            head = head.next;
        }

        int maxIndex = size - n;
        Node prev = head;
        for(int i = 1; i < maxIndex; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printList(head);
        deleteNthNode(head, 3);
        printList(head);
    }    
}
