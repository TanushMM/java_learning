public class Trie {
    static class TRIE {
        static class Node {
            Node[] children = new Node[26];
            boolean eow = false;
            Node() {
                for(int i =0; i < 26; i++) {
                    children[i] = null;
                }
            }
        }
        Node root = new Node();    
    
        public void insert(String word) {
            Node curr = root;
            for(int level = 0; level < word.length(); level++) {
                int index = word.charAt(level) - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Node();
                }
                curr = curr.children[index];
            }
            curr.eow = true;
        }
        public void printAll(Node r, String prefix) {
            if (r == null) {
                return;
            }
            if (r.eow) {
                System.out.println(prefix);
            }
            for(int i =0; i < r.children.length; i++) {
                if (r.children[i] != null) {
                    printAll(r.children[i], prefix + (char)('a' + i));
                }
            }
        }

        public boolean search(String s) {
            Node curr = root;
            for(int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
            }
            return curr.eow == true;
        }
    }
    
    public static void main(String[] args) {
        String[] words = {"the", "their", "there", "thee", "a", "any"};
        TRIE t = new TRIE();
        for(int i =0; i < words.length; i++) {
            t.insert(words[i]);
        }

        t.printAll(t.root, "");
        System.out.println("\n" + t.search("the"));
        System.out.println("\n" + t.search("th"));
    }
}