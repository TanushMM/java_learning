/*
 * This was completely developed by Tanush M M
 */
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        // If there is no head
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // If head is present with more nodes
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index, int data) { // O(n)
        if (index == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node currNode = head;
        int i = 0;
        while (i < index - 1) {
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return -1;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return -1;  
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        int value = prevNode.data;
        prevNode.next = null;
        tail = prevNode;
        size--;
        return value;
    }

    public int iterativeLinearSearch(int key) { // O(n)
        if (size == 0) {
            System.out.println("Linked List is empty");
            return -1;
        }
        Node currNode = head;
        int index = 0;
        while (currNode != null) {
            if (currNode.data == key) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }

    public static int helperRecursiveLinearSearch(Node head, int key, int index) { // O(n)
        if (head == null) {
            return -1;
        } 
        /*these two functions are static because one functions calls another function without
        using the object instance and it can cause errors if the methods are not static */
        if (head.data == key) {
            return index;
        }
        return helperRecursiveLinearSearch(head.next, key, index+1);
    }
    public static int recursiveLinearSearch(Node head, int key) {
        return helperRecursiveLinearSearch(head, key, 0);
    }

    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = null, curr = head, nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
    }

    public void removeNthNode(int n) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        if (size == n) { // it becomes remove at first
            this.removeFirst();
        }
        int index = size - n;
        Node currNode = head;
        for(int i = 1; i < index; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
    }

    public Node findMiddle() {
        /*
         * Using fast and slow pointer
         */
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head, slow = head;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean findPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // finding middle
        Node middle = findMiddle();

        // reversing the linked list from the middle node and comparing both the halves
        Node prev = null;
        Node curr = middle, nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        Node right = prev;
        Node left = head;
        while (left.next != null && right.next != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        
        slow = head;
        /*
         * there can be some corner cases where loop end up in head
         * then if we initialize slow back to head, fast slow would both be in the same position
         * then the while loop would not get executed, if it's not executed the 'prev' will have
         * null stored in it which can lead the 'NullPointerException'.
         */
        Node prev = null;
        while (slow != fast) {
            prev = head;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    private static Node getMidMergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next; // this is done to get the correct nodes in even nodes case
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node merge(Node leftHead, Node rightHead) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (leftHead != null && rightHead != null) {
            if (leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMidMergeSort(head);
        Node rightHead = middle.next;
        middle.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public void zigZag() {
        if (head == null || head.next == null) {
            return;
        }

        Node middle = getMidMergeSort(this.head);
        Node rightStart = middle.next;
        middle.next = null;
        Node prev = null, curr = rightStart, nxt = null;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        Node right = prev;
        Node left = head;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }  
    }

    public void printList() { // O(n)
        if (head == null) {
            System.out.println("Linked List is emmpty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(10);
        list.addLast(5);
        list.addLast(4);
        list.printList();
        list.zigZag();
        list.printList();
    }  
}