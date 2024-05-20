import java.util.*;
import java.util.LinkedList;

public class BinaryTreeMain {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        public int index = -1;
        public Node buildTreePreOrder(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTreePreOrder(nodes);
            newNode.right = buildTreePreOrder(nodes);
            return newNode;
        }

        public void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public void iterativePreOrder(Node root) {
            if (root == null) {
                return;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                Node curr = stack.pop();
                
                System.out.print(curr.data + " ");
                if (curr.right != null) {
                    stack.push(curr.right);
                }
                if (curr.left != null) {
                    stack.push(curr.left);
                }
            }
        }

        public void iterativeInOrder(Node root) {
            if (root == null) {
                return;
            }
            
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTreePreOrder(nodes);
        
        System.out.println("\nPreorder: ");
        tree.preOrder(root);
        System.out.println("\nInorder: ");
        tree.inOrder(root);
        System.out.println("\nPostorder: ");
        tree.postOrder(root);
        System.out.println("\nLevelorder or BFS(Breadth first search): ");
        tree.levelOrder(root);
        System.out.println("\nIterative Preorder: ");
        tree.iterativePreOrder(root);

    }
}