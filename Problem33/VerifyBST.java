/**
 * Created by owen on 2017/11/1.
 */
public class VerifyBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) return false;
        return jugde(sequence, 0, sequence.length - 1);
    }

    private boolean jugde(int[] a, int start, int root) {

        if (start == root) return true;

        //寻找左子树的根
        int i = root - 1;
        while (a[root] < a[i] && i > start)
            i--;
        for (int j = start; j < i; j++) {
            if (a[j] > a[root]) return false;
        }

        jugde(a, start, i);
        jugde(a, i + 1, root);


        return true;

    }

    public static void main(String[] args) {
        VerifyBST bst = new VerifyBST();
        int[] a = {4, 8, 6, 12, 16, 14, 10};
        System.out.println(bst.VerifySquenceOfBST(a));
    }
}
