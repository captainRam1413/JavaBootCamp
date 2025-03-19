package LeetCode;

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

public class GettingValueFromTree {
    public TreeNode r;
    public int i =0;
    public GettingValueFromTree(TreeNode root) {
        r = new TreeNode(0);
        createTree(r, root);

    }

    private void createTree(TreeNode r2, TreeNode root) {
        if (root == null) {
            return;
        }
        int i = r2.val;
        if (root.left != null) {
            r2.left = new TreeNode(2*i+1);
            createTree(r2.left, root.left);
        }
        if (root.right !=null) {
            r2.right = new TreeNode(2*i+2);
            createTree(r2.right, root.right);
        }

    }

    public boolean find(int target) {
        
        return searchDFS(r,target);
    }
    public boolean searchDFS(TreeNode root, int value){
        
        if (root == null) return false;

        
        if (root.val == value) return true;
        
        
        boolean left_res = searchDFS(root.left, value);
        boolean right_res = searchDFS(root.right, value);

        return left_res || right_res;
    }

    public static void main(String[] args) {
        TreeNode rNode = new TreeNode(-1);
        // rNode.left = new TreeNode(-1);
        rNode.right = new TreeNode(-1);
        // rNode.left.left = new TreeNode(-1);
        rNode.right.left = new TreeNode(-1);
        rNode.right.left.left = new TreeNode(-1);
        // rNode.left.right = new TreeNode(-1);
        GettingValueFromTree g = new GettingValueFromTree(rNode);
        System.out.println(g.find(2));
        System.out.println(g.find(3));
        System.out.println(g.find(4));
        System.out.println(g.find(5));
    }

}
