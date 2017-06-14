/**
 * Created by owen on 2017/6/14.
 */
public class FindNumberInTwoDArray {
    /**
     * 二维数组中数字从左到右，从上到下递增
     * 给定一个数字，查找二维数组返回结果
     */
    public boolean find(int[][] a,int s){
        //检查输入有效性
        if (a==null)
            return false;

        int i = 0,j=a[i].length-1;//默认是矩形
        while(i<a.length&&j>=0){
            if (s<a[i][j])//去掉这一列
                j=j-1;
            else if(s>a[i][j])
                i=i+1;//去掉这一行
            else return true;
        }
        return false;
    }
}
