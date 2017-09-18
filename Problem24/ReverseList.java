/**
 * Created by owen on 2017/9/18.
 */
public class ReverseList {
    public ListNode reverse(ListNode head){
        if (head==null) return null;
        ListNode pre,node;
        pre=null;
        node=head;
        while (head!=null){
            node=head.next;
            head.next=pre;
            pre=head;
            head=node;
        }
        return pre;
    }
}
