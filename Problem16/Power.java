/**
 * Created by owen on 2017/9/11.
 * 数值的整数次方
 */

public class Power {
    public static final double INFINITY = 1.0 / 0.0;

    public double power(double base, int exponent) {
        double result = 0;
        if (base == 0 && exponent < 0)
            return INFINITY;
         result = unsignedpower(base,Math.abs(exponent));
         if (exponent<0)
             result =1/result;
         return result;

    }

    private double unsignedpower(double base, int exponent) {
        double result = 0.0;
        if (exponent == 0) return 1.0;
        if (exponent == 1) return base;

        result = unsignedpower(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) result *= base;
        return result;
    }
}
