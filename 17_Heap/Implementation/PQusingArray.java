import java.util.*;

public class PQusingArray {
    static class Heap {
        public List<Integer> list;
        Heap() {
            list = new ArrayList<>();
        }

        public void insert(int data) {
            list.add(data);
            upHeap(list.size()-1);
        }
        public void upHeap(int current) {
            if (current == 0) {
                return;
            }
            int parent = (current - 1) / 2;
            if (list.get(current) < list.get(parent)) {
                swap(current, parent);
                upHeap(parent);
            }
        }
        private void swap(int n1, int n2) {
            int temp = this.list.get(n1);
            list.set(n1, list.get(n2));
            list.set(n2, temp);
        }
        
        public int peek() {
            return list.get(0);
        }



        public int remove() {
            int data = list.get(0);
            int last = list.remove(list.size()-1);

            if (!list.isEmpty()) {
                list.set(0, last);
                downHeap(0);
            }    
            return data;
        }
        public void downHeap(int index) {
            int min = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left < list.size() && list.get(left) < list.get(min)) {
                min = left;
            }
            if (right < list.size() && list.get(right) < list.get(min)) {
                min = right;
            }
            if (min != index) {
                swap(index, min);
                downHeap(min);
            }
        }

        public boolean inEmpty() {
            return this.list.size() == 0;
        }

        public List<Integer> heapSort() {
            List<Integer> list = new ArrayList<>();
            while (!this.inEmpty()) {
                list.add(this.remove());
            }
            return list;
        }
    }
    public static void main(String[] args) {
        // Visualize - Binary Tree
        // Implement - Array

        // Heap is not implemented as a class
        Heap h = new Heap();
        h.insert(20);
        h.insert(10);
        h.insert(30);
        h.insert(60);
        h.insert(40);
        h.insert(5);
        h.insert(50);

        // while (!h.list.isEmpty()) {
        //     System.out.println(h.remove());
        // }

        List<Integer> list = h.heapSort();
        System.out.println(list);
    }    
}
