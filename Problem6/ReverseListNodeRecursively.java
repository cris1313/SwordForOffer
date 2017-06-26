/**
 * Created by owen on 2017/6/25.
 */
public class ReverseListNodeRecursively {
    public void reversing(ListNode root){
        if (root==null) return;
        reversing(root.next);
        System.out.println(root.value);
    }
}
