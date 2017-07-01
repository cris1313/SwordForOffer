/**
 * Created by owen on 2017/7/1.
 */
public class Fibonacci {
    public long reverse(long n){
        if (n==0) return 0;
        if (n==1) return 1;
        return reverse(n-1)+reverse(n-2);
    }
    public long loop(long n){
        if (n==0) return 0;
        if (n==1) return 1;
        int fibNminusOne=1;
        int fibNminusTwo=0;
        int fibN=0;
        for (int i=2;i<=n;i++){
            fibN=fibNminusOne+fibNminusTwo;
            fibNminusTwo=fibNminusOne;
            fibNminusOne=fibN;
        }
        return fibN;
    }
}
