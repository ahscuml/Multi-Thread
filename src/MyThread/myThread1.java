package MyThread;

/**
 * 共享变量与线程安全
 * @author ahscuml
 * @date 18-12-4
 * @time 上午12:45
 */

public class myThread1 extends Thread{
    private int num = 5;
    String name = "null";
    @Override
    synchronized public void run(){
        super.run();
        num--;
        System.out.println(num);
    }

    public myThread1(String name) {
        this.name = name;
    }
}
