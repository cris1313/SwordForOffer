import java.util.Arrays;
import java.util.Stack;

/**
 * Created by owen on 2017/11/5.
 *
 */
public class MoreThanHalfNum {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution2(a));
    }

    /**
     * 采用栈的方式，先排序，如果数相同则进栈，否则清空栈。
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < array.length; i++) {
            if (stack.size() == 0 || stack.peek() == array[i]) {
                stack.push(array[i]);
                if (stack.size() >= array.length >> 1)
                    return stack.peek();
            } else stack.clear();
        }
        return 0;
    }

    /**
     * 采取消耗的策略。出现超过一半次数的数和其余的数消耗，最后剩下的必定为这个数
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution2(int[] array) {
        int num = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i]!=num){
                if (count==0){
                    num=array[i];
                    count++;
                }else count--;
            }else count++;
        }
        if (count<=1){
            int time=0;
            for (int i = 0; i <array.length ; i++) {
                if (num==array[i]) time++;
            }
            if (time>array.length>>1)
                return num;
            else return 0;
        }
        return num;
    }
}
