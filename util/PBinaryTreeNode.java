/**
 * Created by owen on 2017/6/30.
 */
public final class PBinaryTreeNode {
    PBinaryTreeNode left;
    PBinaryTreeNode right;
    PBinaryTreeNode parent;
    int value;
    public static void preOrder(PBinaryTreeNode root){
        if(root==null)return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
}
