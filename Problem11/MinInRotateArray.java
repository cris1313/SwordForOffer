/**
 * Created by owen on 2017/7/2.
 */
public class MinInRotateArray {
    //二分查找
    //写之前要有思路 不能瞎写
    //（1）循环条件（2）临界条件（3）结果临界点
    public int min(int[] a){
        int start =0;
        int end = a.length-1;
        int mid=0;
        while (a[start]>=a[end]){
            mid=(start+end)/2;
            if (end-start==1){
                mid=end;
                break;
            }
            if (a[start]==a[end]&&a[start]==a[mid])
                return minInOrder(a,start,end);
            if (a[start]>=a[mid])
                end=mid;
            else if(a[end]<=a[mid])
                start=mid;
        }

        return a[mid];

    }
    private int minInOrder(int[] a,int start,int end){
        int min=a[start];
        for (int i = start; i < end ; i++) {
            if (a[i]<a[min])
                min=i;
        }
        return a[min];
    }
}
