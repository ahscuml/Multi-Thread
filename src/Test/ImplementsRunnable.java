package Test;
import Runnable.MyRunnable;
/**
 * @author ahscuml
 * @date 18-12-4
 * @time 上午12:29
 */
public class ImplementsRunnable {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        MyRunnable my = new MyRunnable();
        my.run();
        thread.start();
        System.out.println("Over");
    }
}
