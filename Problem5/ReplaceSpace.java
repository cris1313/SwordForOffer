/**
 * Created by owen on 2017/6/14.
 */
public class ReplaceSpace {
    /**
     * 将空格替换为%20
     */
    public void replace(char[] chars,int cLength){
        //检查输入有效性
        if(chars==null) return;
        int numberOfChar=0;
        for (int j=0;j<chars.length;j++){
            if (chars[j]!='\u0000')
            numberOfChar++;
        }
        if (numberOfChar!=cLength) return;

        //统计空格个数
        int numberOfSpace = 0;
        for (int i=0;i<cLength;i++){
            if (chars[i]==' '){
                numberOfSpace++;
            }
        }

        int newLength = numberOfSpace*2+cLength;
        if (newLength>chars.length)
            return;
        int indexOfOld = cLength-1;
        int indexOfNew = newLength-1;

        //从后往前替换
        while (indexOfOld>=0&&indexOfNew>indexOfOld){
            if (chars[indexOfOld]==' '){
                chars[indexOfNew--]='0';
                chars[indexOfNew--]='2';
                chars[indexOfNew--]='%';
            }
            else chars[indexOfNew--] = chars[indexOfOld];
            --indexOfOld;
        }

    }

}
