/**
 * Created by owen on 2017/8/13.
 */
public class NumberOf1 {
    public int shift(int n) {
        int count = 0;
        int bit = 1;
        while (bit!=0) {
            if ((bit & n) != 0) count++;
            bit = bit << 1;
        }
        return count;
    }
    public int binary(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }

}
