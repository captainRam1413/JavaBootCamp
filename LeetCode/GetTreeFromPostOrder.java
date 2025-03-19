class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class GetTreeFromPostOrder {
    public static void main(String[] args) {
        String s = "1-2--3--4-5--6--7";
        TreeNode node = recoverFromPreorder(s);
        printPreOr(node);
    }

    public static TreeNode recoverFromPreorder(String traversal) {
        int pos[] = new int[1];
        int n = traversal.length();
        int nodeVal = getValue(traversal, n, pos);
        TreeNode root = new TreeNode(nodeVal);
        buildTree(root, 1, traversal, n, pos);
        buildTree(root, 1, traversal, n, pos);
        return root;
    }

    public  static void buildTree(TreeNode root, int i, String str, int n, int[] pos) {
        if (pos[0] == n) {
            return;
        }
        int originalpos = pos[0];
        int dashLen = getDash(str, n, pos);
        if (dashLen != i) {
            pos[0] = originalpos;
            return;
        }
        int nodeVal = getValue(str, n, pos);
        TreeNode node = new TreeNode(nodeVal);
        if (root.left ==null) {
            root.left = node;
        }
        else{
            root.right = node;
        }
        buildTree(node, i+1, str, n, pos);
        buildTree(node, i+1, str, n, pos);
    }

    private  static int getDash(String str, int n, int[] pos) {
       int dash = pos[0];
       while (pos[0]<n && str.charAt(pos[0]) == '-') {
            pos[0]++;
       }
       return pos[0]-dash;
    }

    public static int getValue(String str, int n, int[] pos) {
        int val = 0;
        while (pos[0] < n && Character.isDigit(str.charAt(pos[0]))) {
            val = val * 10 + str.charAt(pos[0]) - '0';
            pos[0]++;
        }
        return val;
    }

    public  static void printPreOr(TreeNode node)
    {
        if (node == null)
            return;

        // First deal with the node
        System.out.print(node.val + " ");

        // Then recur on left subtree
        printPreOr(node.left);

        // Finally recur on right subtree
        printPreOr(node.right);
    }

}
