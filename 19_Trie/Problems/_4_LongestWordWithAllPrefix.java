public class _4_LongestWordWithAllPrefix {
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

        public String answer = "";
        public void longestWord(Node root, StringBuilder temp) {
            // no need for base case, as we will check it in the for loop
            for(int i =0; i < 26; i++) {
                if (root.children[i] != null && root.children[i].eow == true) {
                    char c = (char)(i + 'a');
                    temp.append(c);
                    if (temp.length() > answer.length()) {
                        answer = temp.toString();
                    }
                    longestWord(root.children[i], temp);
                    // backtracking step
                    temp.deleteCharAt(temp.length() - 1);
                }
            }
        }
        /*
         * the above function will automatically have the longest word lexicographically
         * if two words are found with same length, this is because of the presence of 
         *  > instead of >= in the "if" statement in the above function
         */
    }
    public static void main(String[] args) {
        Trie t = new Trie();
        String[] words = {"a", "banana", "appl", "app", "ap", "apply", "apple"};
        for(int i = 0; i < words.length; i++) {
            t.insert(words[i]);
        }
        t.longestWord(t.root, new StringBuilder());
        System.out.println(t.answer);
    }    
}
