/**
 * Created by owen on 2017/6/25.
 */
public class Test6 {

    public static void main(String[] args) {

        ListNode root = new ListNode();
        root.value=90;
        root.next=null;
        ListNode lastOne =root;
        for (int i=0;i<10;i++){
            ListNode temp = new ListNode();
            temp.value=i;
            lastOne.next=temp;
            lastOne=temp;
        }
        /*ReverseListNode reverseListNode=new ReverseListNode();
        reverseListNode.reversing(root);*/
        ReverseListNodeRecursively reve = new ReverseListNodeRecursively();
        reve.reversing(root);

    }
}
