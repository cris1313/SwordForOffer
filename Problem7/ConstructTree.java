/**
 * Created by owen on 2017/6/30.
 */
public class ConstructTree {
    public BinaryTreeNode constructCore(int[] pre, int[] in) {
        if (pre.length!=in.length||pre==null||in==null){
            //无效输入 抛出异常
        }
        return constructCore(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    private BinaryTreeNode constructCore(int[] pre, int[] in, int startPre, int endPre, int startIn, int endIn) {
        if (startPre>endPre||startIn>endIn||endPre-startPre!=endIn-startIn) {
            //无效输入 抛出异常
        }
        BinaryTreeNode root = new BinaryTreeNode();
        int rootVal = pre[startPre];
        root.value = rootVal;
        root.left = root.right = null;
        //递归基本条件
        if (startPre == endPre) {
            if (endIn == startIn && pre[startPre] == in[startIn]) {
                return root;
            } else {//抛出异常
            }
        }
        //在中序遍历中找到rootVal
        int rootIn = startIn;
        while(in[rootIn]!=rootVal&&rootIn<endIn)
            ++rootIn;
        if (in[rootIn]!=rootVal&&rootIn==endIn) {
            //抛出异常
        }

        //构建左子树
        int length = rootIn-startIn;
        if(length>0){
            root.left= constructCore(pre,in,startPre+1,startPre+length,startIn,rootIn-1);
        }
        //构建右子树
        if (length<endPre-startPre){
            root.right = constructCore(pre,in,startPre+length+1,endPre,rootIn+1,endIn);
        }
        return root;
    }
}