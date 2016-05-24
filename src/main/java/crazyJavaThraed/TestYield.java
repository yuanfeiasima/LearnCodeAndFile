package crazyJavaThraed;

import sun.security.util.AuthResources_de;

/**
 * Created by wangwentao on 2016/5/23.
 * sleep 有更好的移植性
 */
public class TestYield extends Thread {
    public TestYield(String name) {
        super(name);
    }

    public void run(){
        for (int i=0;i<50;i++) {
            System.out.println(getName()+" "+i);
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        TestYield ty1 = new TestYield("高级");
        ty1.setPriority(Thread.MAX_PRIORITY);
        ty1.start();
        TestYield ty2 = new TestYield("低级");
        ty2.setPriority(Thread.MIN_PRIORITY);
        ty2.start();
    }
}
