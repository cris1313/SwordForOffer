/**
 * Created by owen on 2017/7/1.
 */
public class Test10 {
    public static void main(String[] args) {
        Fibonacci fibonacci= new Fibonacci();
        long before1=System.currentTimeMillis();

        System.out.println(fibonacci.reverse(40));
        long after1 = System.currentTimeMillis();
        System.out.println(fibonacci.loop(40));
        long after2 = System.currentTimeMillis();
        System.out.println(after1-before1);
        System.out.println(after2-after1);
    }
}
