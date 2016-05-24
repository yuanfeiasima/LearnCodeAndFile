package crazyJavaThraed;

/**
 * Created by G on 2016/5/23.
 */
public class SecondThread implements Runnable{
    private int i;//可以共享一个target的实例变量
    public void run() {
        for (;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                SecondThread secondThread1 = new SecondThread();
                SecondThread secondThread2 = new SecondThread();
                new Thread(secondThread1, "新线程1").start();
                new Thread(secondThread2, "新线程2").start();
            }
        }
    }
}
