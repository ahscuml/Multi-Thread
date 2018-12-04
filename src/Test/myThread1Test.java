package Test;

import MyThread.myThread1;

/**
 * 共享变量与线程安全
 * @author ahscuml
 * @date 18-12-4
 * @time 上午12:47
 */

public class myThread1Test {
    public static void main(String[] args) {
        // 直接创造新线程
        myThread1 thread1 = new myThread1("A");
        myThread1 thread2 = new myThread1("B");
        myThread1 thread3 = new myThread1("C");
        thread1.start();
        thread2.start();
        thread3.start();
        // 构造线程时传入Thread类对象(Thread类实现了Runnable接口)
        myThread1 thread4 = new myThread1("D");
        Thread thread5= new Thread(thread4,"a");
        Thread thread6 = new Thread(thread4,"b");
        Thread thread7 = new Thread(thread4,"c");
        Thread thread8 = new Thread(thread4,"d");
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    }
}
