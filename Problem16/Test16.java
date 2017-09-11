/**
 * Created by owen on 2017/9/11.
 */
public class Test16 {
    public static void main(String[] args) {
        Power power = new Power();
        int[] test = {0,1,-1};
        for (int a:test){
            System.out.println(power.power(a,test[0]));
            System.out.println(power.power(a,test[1]));
            System.out.println(power.power(a,test[2]));

        }

    }
}
