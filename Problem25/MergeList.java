/**
 * Created by owen on 2017/9/18.
 */
public class MergeList {
    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        ListNode mergeHead = null;
        if (head1.value < head2.value) {
            mergeHead = head1;
            mergeHead.next = merge(head1.next, head2);
        } else {
            mergeHead = head2;
            mergeHead.next = merge(head1, head2.next);
        }
        return mergeHead;
    }

}
