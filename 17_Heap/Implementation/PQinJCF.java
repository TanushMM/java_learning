import java.util.PriorityQueue;
import java.util.Collections;

public class PQinJCF {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(199);
        pq.add(10)
;
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }


        // PriorityQueue for Objects
        PriorityQueue<Student> objectPQ = new PriorityQueue<>(Collections.reverseOrder());

        objectPQ.add(new Student("Tanush", 1));
        objectPQ.add(new Student("Gouri", 1));
        objectPQ.add(new Student("DarshanRaj", 2));

        while (!objectPQ.isEmpty()) {
            System.out.println(objectPQ.peek().name + " -> " + objectPQ.peek().rank);
            objectPQ.remove();
        } 
    }    
}
