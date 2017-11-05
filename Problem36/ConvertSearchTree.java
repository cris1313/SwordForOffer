/**
 * Created by owen on 2017/10/31.
 */

public class ConvertSearchTree {
    private TreeNode tail;
    private TreeNode head;

    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }

    public void ConvertSub(TreeNode pRootOfTree) {

        if (pRootOfTree == null) return;

        Convert(pRootOfTree.left);

        if (tail != null) {
            tail.right = pRootOfTree;
            pRootOfTree.left = tail;
            tail = pRootOfTree;
        } else {
            head = pRootOfTree;
            tail = pRootOfTree;
        }
        Convert(pRootOfTree.right);
    }
}
