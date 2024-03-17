public class DoublyLinkedList {
    public class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        Node currNode = head;
        Node newNode = new Node(data);
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        newNode.next = null;
        size++;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MAX_VALUE;
        } 
        if (size == 1) {
            int value = head.data;
            head = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null; //  this will give error 
        // if we have only one node in the DLL
        size--;
        return value;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            int value = head.data;
            head = head.next;
            size--;
            return value;
        }
        Node currNode = head;
        Node prev = null;
        while (currNode.next != null) {
            prev = currNode;
            currNode = currNode.next;
        }
        int value = currNode.data;
        prev.next = null;
        size--;
        return value;
    }

    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        } 
        Node prev = null, curr = head, nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            curr.prev = prev;

            prev = curr;
            curr = nxt;
        }
        head = prev;
    }

    public void printList() {
        if(head == null) {
            System.out.println("DLL is empty");
            return;
        }
        Node currNode = head;
        System.out.print("NULL <-> ");
        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        System.out.println("Size: " + list.size);
        list.reverseIterative();
        list.printList();
        System.out.println("Size: " + list.size);
    }   
}
