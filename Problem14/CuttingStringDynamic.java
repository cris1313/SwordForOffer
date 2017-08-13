/**
 * Created by owen on 2017/8/13.
 */
public class CuttingStringDynamic {
    public int cut(int length) {

        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;
        int[] result = new int[length + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;


        for (int i = 4; i <= length; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (result[j] * result[i - j] > max)
                    max = result[j] * result[i - j];

                result[i] = max;
            }
        }

        return result[length];

    }
}
