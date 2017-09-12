/**
 * Created by owen on 2017/9/12.
 * 删除非尾结点的时间复杂度是O(1),删除尾结点的时间复杂度是O(N)平均复杂度是O(1)
 * 算法的缺点是不能排查要删除的结点是否在链表内（因为排查的时间复杂度是O(N)）
 *
 */
public class DeleteInO1 {
    public void deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null) return;
        //要删除节点不是尾结点
        if (tobeDelete.next != null) {
            tobeDelete.value = tobeDelete.next.value;
            tobeDelete.next = tobeDelete.next.next;
        } else if (head.next == null) {
            //链表中只有头结点
            head = null;
        } else {
            //链表中有多个结点
            ListNode tmp = head.next;
            while (tmp != null) {
                if (tmp.next == tobeDelete) {
                    tmp.next = tobeDelete.next;
                    break;
                }
                tmp = tmp.next;
            }
        }

    }
}
