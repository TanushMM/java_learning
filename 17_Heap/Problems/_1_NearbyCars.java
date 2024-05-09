import java.util.PriorityQueue;

public class _1_NearbyCars {
    static class Info implements Comparable<Info> {
        int x;
        int y;
        int d;
        Info(int x, int y, int d) {
            this.x = x;this.y = y; this.d = d;
        }

        @Override
        public int compareTo(Info that) {
            return this.d - that.d;
        }
    }

    public static void nearbyCars(int[][] cars, int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>();
        for(int[] i : cars) {
            double dist = Math.pow(i[0],2) + Math.pow(i[1],2);
            pq.add(new Info(i[0],i[1],(int)dist));
        }

        for(int i =0; i < k; i++) {
            Info temp = pq.poll();
            System.out.println("[" + temp.x +","+ temp.y +"]");
        }
    }

    public static void main(String[] args) {
        int[][] cars = {{3,3},{5,-1},{-2,4}};
        nearbyCars(cars, 2);
    }
}
