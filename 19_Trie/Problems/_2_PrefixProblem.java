public class _2_PrefixProblem {
    static class Trie {
        static class Node {
            Node[] children = new Node[26];
            boolean eow = false;
            int freq;
            Node() {
                for(int i =0; i < 26; i++) {
                    children[i] = null;
                }
                freq = 1;
            }
        }

        private Node root = new Node();

        public void insert(String s) {
            Node curr = root;
            for(int i = 0; i < s.length(); i++) {   
                int index = s.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Node();
                } else {
                    curr.children[index].freq++;
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

        public void findPrefix(Node root, String answer) {
            if (root == null) {
                return;
            }
            if (root.freq == 1) {
                System.out.println(answer);
                return;
            }
            for(int i =0; i < 26; i++) {
                if (root.children[i] != null) {
                    findPrefix(root.children[i], answer + (char)(i +'a'));
                }
            }
        }
    }
    public static void main(String[] args) {
        Trie t = new Trie();
        String[] words = {"zebra", "dog", "duck", "dove"};
        for(int i = 0; i < words.length; i++) {
            t.insert(words[i]);
        }

        t.root.freq = -1;

        t.findPrefix(t.root, "");
    }    
}