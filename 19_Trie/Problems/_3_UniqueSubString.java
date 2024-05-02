public class _3_UniqueSubString {
    static class Trie {
        static class Node {
            Node[] children = new Node[26];
            boolean eow = false;
            Node() {
                for(int i =0; i < 26; i++) {
                    children[i] = null;
                }
            }
        }

        private Node root = new Node();

        public void insert(String s) {
            Node curr = root;
            for(int i = 0; i < s.length(); i++) {   
                int index = s.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Node();
                }
                curr = curr.children[index];
            }
            curr.eow = true;
        }

        public void printAll(Node n, String prefix) {
            if (n == null) { // Don't need this statement
                return;
            }
            if (n.eow) {
                System.out.println(prefix);
            }
            for(int i =0; i < 26; i++) {
                if (n.children[i] != null) {
                    printAll(n.children[i], prefix + (char)(i + 'a'));
                }
            }
        }

        public boolean search(String s) {
            Node curr = root;
            for(int i =0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
            }
            return curr.eow == true;
        }

        public int countUniqueSubString(Node root) {
            int count = 0;
            for(int i =0; i < 26; i++) {
                if (root.children[i] != null) {
                    count += countUniqueSubString(root.children[i]);
                }
            }
            return count + 1;
        }
    }
    public static void main(String[] args) {
        Trie t = new Trie();
        String s = "apple";
        
        for(int i =0; i < s.length(); i++) {
            t.insert(s.substring(i));
        }

        System.out.println(t.countUniqueSubString(t.root));
    }       
}
