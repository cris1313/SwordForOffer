/**
 * Created by owen on 2017/6/13.
 */
public class MultiThreadSingleton {
    /**
     * 多线程模式下线程安全的单例模式
     */
    private MultiThreadSingleton(){}
    public static volatile MultiThreadSingleton INSATCNE;
    public static  MultiThreadSingleton getINSATCNE() {
        if (INSATCNE == null)
            synchronized (MultiThreadSingleton.class) {
                if (INSATCNE == null)
                    INSATCNE = new MultiThreadSingleton();
            }
        return INSATCNE;

    }

}
