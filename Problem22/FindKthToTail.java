/**
 * Created by owen on 2017/9/18.
 */
public class FindKthToTail {
    public ListNode find(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode node1, nodeBehind;
        node1 = head;
        nodeBehind = head;
        for (int i = 0; i < k - 1; i++) {
            if (node1.next != null) node1 = node1.next;
            else return null;
        }
        while (node1.next != null) {
            node1 = node1.next;
            nodeBehind = nodeBehind.next;
        }
        return nodeBehind;
    }
}
