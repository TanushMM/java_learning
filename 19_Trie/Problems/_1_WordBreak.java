public class _1_WordBreak {
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

        private boolean search(String s) {
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

        public boolean wordBreak(String key) {
            if (key.length() == 0) {
                return true;
            }
            for(int i = 0; i < key.length(); i++) {
                if (search(key.substring(0, i+1)) && wordBreak(key.substring(i+1))) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Trie t = new Trie();
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i < words.length; i++) {
            t.insert(words[i]);
        }

        String key = "ilikesamsung";

        System.out.println(t.wordBreak(key));


    }    
}
