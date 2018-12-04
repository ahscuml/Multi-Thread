package Test;

import MyThread.Sleep;

/**
 * 测试Sleep方法
 *
 * @author ahscuml
 * @date 18-12-4
 * @time 下午12:27
 */
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        Sleep sleep = new Sleep();
        Sleep sleep1 = new Sleep();
        System.out.println("main:" + System.currentTimeMillis());
        sleep.start();
        sleep1.start();
        Thread.sleep(1000);
        System.out.println("main:" + System.currentTimeMillis());
    }
}
