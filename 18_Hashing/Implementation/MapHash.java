import java.util.LinkedList;
import java.util.ArrayList;

public class MapHash {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N -> buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4;
            this.buckets = new LinkedList[4];
            // in some version we have to provide the type of linkedlist in the above declerations but we use generics
            // for the inly we use @SupressWarnings("unchecked")
            for(int i =0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            // the value can be anything but we want the bucket index (+ or -)
            // hence we take Math.abs()
            // and we want index to be 0 to buckets.length hence we take modulo with respect to size
            return Math.abs(hc) % N;
        }
        private int searchInLL(K key, int bi) {
            LinkedList<Node> temp = buckets[bi];
            for(int i = 0; i < temp.size(); i++) {
                if (temp.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            n = 0;
            for(int i =0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i =0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }

        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // not present
                LinkedList<Node> temp = buckets[bi];
                temp.add(new Node(key, value));
                n++;
            } else { // present
                LinkedList<Node> temp = buckets[bi];
                Node node = temp.get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // not present
                return null;
            } else { // present
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // not present
                return null;
            } else { // present
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> list = new ArrayList<>();
            for(int i =0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll) {
                    list.add(node.key);
                }
            }

            return list;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Nepal", 5);
        
        ArrayList<String> key = map.keySet();
        for(String s : key) {
            System.out.println(s + " -> " + map.get(s));
        }
        System.out.println(map.n);

        map.remove("Nepal");
        key = map.keySet();
        for(String s : key) {
            System.out.println(s + " -> " + map.get(s));
        }

        System.out.println(map.n);
    }
}