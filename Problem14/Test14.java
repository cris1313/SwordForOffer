/**
 * Created by owen on 2017/8/13.
 */
public class Test14 {
    public static void main(String[] args) {
        CuttingStringDynamic dynamic = new CuttingStringDynamic();
        CuttingStringGreedy greedy =new CuttingStringGreedy();
        int result = dynamic.cut(10);
        int gResult = greedy.cut(10);
        System.out.println(result);
        System.out.println(gResult);
    }
}
