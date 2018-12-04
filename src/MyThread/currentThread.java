package MyThread;

/**
 * @author ahscuml
 * @date 18-12-4
 * @time 上午9:45
 */
public class currentThread  extends Thread{
    public currentThread() {
        System.out.println("lalala " + this.currentThread().getName());
        System.out.println("lalala2 " + this.getName());
    }

    @Override
    public void run() {
        System.out.println("currentThread + " + Thread.currentThread().getName());
        System.out.println("---");
        System.out.println("this: " + this.currentThread().getName());
    }
}
