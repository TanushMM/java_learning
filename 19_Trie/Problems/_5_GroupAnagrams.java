import java.util.*;

public class _5_GroupAnagrams {
    static class Trie {
        static class Node {
            Node[] children = new Node[26];
            boolean end = false;
            List<String> data = new ArrayList<>();

            Node() {
                for(int i =0; i < 26; i++) {
                    children[i] = null; 
                }
            }
        }

        private Node root = new Node();

        public void build(String word) {
            Node curr = root;
            char[] array = word.toCharArray();
            Arrays.sort(array);

            for(char c : array) {
                Node node = curr.children[c-'a'];
                if (node == null) {
                    curr.children[c-'a'] = new Node();
                }
                curr = curr.children[c-'a'];
            }
            curr.end = true;
            curr.data.add(word);
        }
        public void dfs(Node root, List<List<String>> list) {
            if (root.end) {
                list.add(root.data);
            }

            for(int i =0; i < 26; i++) {
                if (root.children[i] != null) {
                    dfs(root.children[i], list);
                }
            }
        }
    }
    public static void main(String[] args) {
        List<List<String>> answer = new ArrayList<>();
        Trie t = new Trie();
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        for(String s : words) {
            t.build(s);
        }

        t.dfs(t.root, answer);
        System.out.println(answer);
    }
}
