/**
 * Created by owen on 2017/6/30.
 */
public class NextNode {
    public PBinaryTreeNode getNext(PBinaryTreeNode root,PBinaryTreeNode node)throws Exception{
        PBinaryTreeNode next=null;
        //如果给定结点有右子树，则下一个结点是右子树的最左结点
        if (node.right!=null){
            PBinaryTreeNode right = node.right;
            while (right.left!=null){
                right=right.left;
            }
            next=right;
        }
        //否则沿着树向上找到一个结点且这个结点为它父结点的左子结点
        else if(node.parent!=null){
            PBinaryTreeNode parentNode = node.parent;
            PBinaryTreeNode current = node;
            while(parentNode!=null&&current==parentNode.right){
                current=parentNode;
                parentNode=parentNode.parent;
            }
            next = parentNode;
        }
        return next;
    }
}
