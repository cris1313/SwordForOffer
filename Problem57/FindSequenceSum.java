import java.util.ArrayList;
import java.util.List;

/**
 * Created by owen on 2018/1/27.
 */
public class FindSequenceSum {

    /**
     * 递增数列中两个数的和为s
     *
     * @param array
     * @param s
     * @return
     */
    public boolean findNumbersWithSum(int[] array, int s) {
        boolean result = false;
        int length = array.length;
        int j = length - 1;
        int i = 0;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == s)
                return true;
            else if (sum < s) {
                i += 1;
            } else {
                j -= 1;
            }
        }
        return result;
    }

    /**
     * 输入一个正数s,输出和为s的连续正数序列
     *
     * @param sum
     * @return
     */
    public List<ArrayList> findSequence(int sum) {
        List<ArrayList> lists = new ArrayList<>();
        int head = 1;
        int tail = 2;

        while (head < tail) {
            int s = findSequenceHelper(head, tail);

            if (s < sum) {
                tail += 1;
            } else if (s > sum) {
                head += 1;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = head; i <= tail; i++) {
                    list.add(i);
                }
                lists.add(list);
                tail += 1;
            }
        }
        return lists;


    }

    private int findSequenceHelper(int head, int tail) {
        int s = 0;
        for (int i = head; i <= tail; i++) {
            s += i;
        }
        return s;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
//        System.out.println(new FindSequenceSum().findNumbersWithSum(a, 10));
        System.out.println(new FindSequenceSum().findSequence(9));
    }
}
