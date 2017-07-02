/**
 * Created by owen on 2017/7/2.
 */
public class Test11 {
    public static void main(String[] args) {
        MinInRotateArray instance =new MinInRotateArray();
        int[] a={3,4,5,1,2};
        int[] b={1,0,1,1,1};
        System.out.println(instance.min(a));
        System.out.println(instance.min(b));
    }
}
