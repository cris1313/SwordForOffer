/**
 * Created by owen on 2017/6/30.
 */
public final class PBinaryTreeNode {
    PBinaryTreeNode left;
    PBinaryTreeNode right;
    PBinaryTreeNode parent;
    int value;
    //先序遍历
    public static void preOrder(PBinaryTreeNode root){
        if(root==null)return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    public static void inOrder(PBinaryTreeNode root){
        if (root==null) return;
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
    //后序遍历
    public static void postOrder(PBinaryTreeNode root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }


}
