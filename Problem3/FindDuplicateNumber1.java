/**
 * Created by owen on 2017/6/13.
 */
public class FindDuplicateNumber1 {
    /**
     * 找出数组中重复的数字
     * 数组长度为n,数组中的数字为0~n-1
     * 返回重复的数字
     */
    public int find(int[] a){
        //检查输入有效性
        if (a.length<=0)
            return -1;
        for (int j = 0;j<a.length;j++) {
            if (a[j] >= a.length||a[j]<0)
                return -1;
        }
        //为数组排序
        for (int i=0;i<a.length;i++){
            while (a[i]!=i) {
                if (a[i]!=a[a[i]])
                a[a[i]] = a[i];
                else return a[i];
            }
        }
        return -1;
    }
}
