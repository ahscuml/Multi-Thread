package MyThread;

/**
 * @author ahscuml
 * @date 18-12-4
 * @time 上午12:12
 */
public class myThread extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("新建的线程");
    }
}
