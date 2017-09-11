import java.util.HashSet;
import java.util.Set;

/**
 * Created by owen on 2017/9/11.
 */
public class Test15 {
    public static void main(String[] args) {
        NumberOf1 a = new NumberOf1();
        Set<Integer> testSet = new HashSet<>(4);
        testSet.add(0);
        testSet.add(0x7FFFFFFF);
        testSet.add(0x80000000);
        testSet.add(0xFFFFFFFF);
        for (Integer integer:testSet){
            System.out.println(a.binary(integer));
            System.out.println(a.shift(integer));
        }

    }
}
