/**
 * Created by owen on 2017/6/13.
 */
public class StaticSingleton {
    /**
     * 使用静态内部类实现的单例模式
     */
    public static StaticSingleton getInstance(){return Inner.INSTANCE;}
    private StaticSingleton(){}
    private static class Inner{
        final static StaticSingleton INSTANCE = new StaticSingleton();
    }
}
