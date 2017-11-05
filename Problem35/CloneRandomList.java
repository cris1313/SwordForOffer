/**
 * Created by owen on 2017/10/30.
 * 复制复杂链表
 */
public class CloneRandomList {


    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) return null;

        //复制插入
        RandomListNode curr = pHead;
        while (curr != null) {
            RandomListNode node = new RandomListNode(curr.label);
            node.next = curr.next;
            curr.next = node;
            curr = curr.next.next;
        }

        //复制random
        curr = pHead;
        while (curr != null) {
            RandomListNode next = curr.next;
            if (curr.random != null)
                next.random = curr.random.next;
            curr = next.next;
        }

        //拆链表
        curr = pHead;
        RandomListNode tmp;
        RandomListNode result = curr.next;
        while (curr != null) {
            tmp = curr.next;
            curr.next = tmp.next;
            if (tmp.next != null) {
                tmp.next = tmp.next.next;
            }
            curr = curr.next;

        }
        return result;
    }
}
