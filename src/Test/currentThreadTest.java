package Test;

import MyThread.currentThread;

/**
 * @author ahscuml
 * @date 18-12-4
 * @time 上午9:49
 */
public class currentThreadTest {
    public static void main(String[] args) {
        MyThread.currentThread currentThread = new currentThread();
        Thread t1 = new Thread(currentThread);
        t1.setName("Thread");
        t1.start();
    }
}
