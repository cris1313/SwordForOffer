/**
 * Created by owen on 2017/6/13.
 */
public class FindDuplicateNumber2 {
    /**
     * 不修改数组的情况下找出重复的数字
     * 数组长度n+1,数字的范围在1~n
     * 要求返回重复的数字
     */
    public int find(int[] a){

        //检查输入有效性
        if (a==null) return -1;
        for (int j=0;j<a.length;j++){
            if (a[j]<1||a[j]>=a.length)
                return -1;
        }
        //二分法查找重复数字
        int start = 1;
        int end = a.length-1;
        while (end>=start){
            int middle = (end+start)/2;
            int count = count(a,start,middle);
            if(end==start){
                if (count>1)
                    return start;
                else break;
            }

            if (count>(middle-start+1)){
                end = middle-1;
            }
            else{
                start = middle+1;
            }
        }
        return -1;
    }
    private int count(int[] a,int start,int middle){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]<=middle&&a[i]>=start)
                count++;
        }
        return count;
    }

}
