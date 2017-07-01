import java.util.Stack;

/**
 * Created by owen on 2017/7/1.
 */
public class QueueWithTwoStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public Integer deleteHead() throws Exception{
        if (stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) throw new Exception();
        return stack2.pop();
    }

    public void appendTail(Integer a){
        stack1.push(a);
    }
}
