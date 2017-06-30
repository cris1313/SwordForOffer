/**
 * Created by owen on 2017/6/25.
 */
public final class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    //先序遍历
    public static void preOrder(BinaryTreeNode root){
        if(root==null)return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    public static void inOrder(BinaryTreeNode root){
        if (root==null) return;
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
    //后序遍历
    public static void postOrder(BinaryTreeNode root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
}
