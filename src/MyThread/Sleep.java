package MyThread;

/**
 * Sleep方法
 * @author ahscuml
 * @date 18-12-4
 * @time 下午12:25
 */
public class Sleep extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName() + " time: " + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(currentThread().getName() + " time: " + System.currentTimeMillis());
    }
}
