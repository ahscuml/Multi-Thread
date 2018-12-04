package Test;

import MyThread.myThread;

/**
 * @author ahscuml
 * @date 18-12-4
 * @time 上午12:09
 */
public class ExtendThread {

    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.start();
        System.out.println("线程运行结束");
    }
}
