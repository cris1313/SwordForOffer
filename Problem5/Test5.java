/**
 * Created by owen on 2017/6/14.
 */
public class Test5 {
    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        char[] chars = new char[30];
        String s = "we are happy";
        char[] a = s.toCharArray();
        for (int i = 0;i<a.length;i++){
            chars[i]=a[i];
        }

        replaceSpace.replace(chars,12);
        for (int i = 0; i <chars.length ; i++) {
            System.out.print(chars[i]);
        }

    }


}
