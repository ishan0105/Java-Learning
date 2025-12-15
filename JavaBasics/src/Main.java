//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    public void preOrder(TreeNode node){
        if(node == null) return;
        System.out.println("Value: " + node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 3;
        node.left = new TreeNode();
        node.left.val = 2;
        node.right = new TreeNode();
        node.right.val = 4;
        node.left.left = new TreeNode();
        node.left.left.val = 1;
        node.right.right = new TreeNode();
        node.right.right.val = 5;

        node.preOrder(node);

    }
}