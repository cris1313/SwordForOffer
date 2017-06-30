/**
 * Created by owen on 2017/6/30.
 */
public class Trst7 {
    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        ConstructTree constructTree = new ConstructTree();
        PBinaryTreeNode root = constructTree.constructCore(pre,in);
        //先序遍历验证
        PBinaryTreeNode.preOrder(root);
    }

}
