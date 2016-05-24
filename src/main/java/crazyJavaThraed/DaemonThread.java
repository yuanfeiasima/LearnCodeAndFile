package crazyJavaThraed;

/**
 * Created by wangwentao on 2016/5/23.
 */
public class DaemonThread extends Thread{
    public void run(){
        for (int i =0; i<100;i++) {
            System.out.println(getName() +" "+i);
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        t.setDaemon(true);//在start之前设置
        t.start();
        for (int i = 0; i<100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
