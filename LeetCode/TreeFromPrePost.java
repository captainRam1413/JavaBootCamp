import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

class TreeFromPrePost {

    // Function to construct Full Binary Tree from preorder and postorder
    static Node constructTreeUtil(int[] pre, int[] post, int[] preIndex, int l, int h, int size, Map<Integer, Integer> postMap) {
        if (preIndex[0] >= size || l > h)
            return null;

        // Create root node
        Node root = new Node(pre[preIndex[0]]);
        preIndex[0]++;

        // If there's only one node, return it (leaf node case)
        if (l == h)
            return root;

        // Get index of next preorder element in postorder using HashMap
        int postIndex = postMap.get(pre[preIndex[0]]);

        // Construct left and right subtrees
        if (postIndex <= h) {
            root.left = constructTreeUtil(pre, post, preIndex, l, postIndex, size, postMap);
            root.right = constructTreeUtil(pre, post, preIndex, postIndex + 1, h - 1, size, postMap);
        }

        return root;
    }

    // Wrapper function to initiate tree construction
    static Node constructTree(int[] pre, int[] post) {
        int size = pre.length;
        int[] preIndex = { 0 };

        // Create a HashMap to store indices of postorder elements
        Map<Integer, Integer> postMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            postMap.put(post[i], i);
        }

        return constructTreeUtil(pre, post, preIndex, 0, size - 1, size, postMap);
    }

    // Function to print inorder traversal of the constructed tree
    static void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int[] post = {8, 9, 4, 5, 2, 6, 7, 3, 1};

        Node root = constructTree(pre, post);

        System.out.println("Inorder Traversal of Constructed Tree:");
        printInorder(root);
    }
}
