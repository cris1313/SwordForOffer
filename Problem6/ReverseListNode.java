import java.util.Stack;

/**
 * Created by owen on 2017/6/25.
 */
public class ReverseListNode {

    public void reversing(ListNode root){
        if (root==null) return;
        Stack<Integer> stack = new Stack<>();
        ListNode node=root;
        while (node.next!=null){
            stack.push(node.value);
            node=node.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
