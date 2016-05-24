package crazyJavaThraed;

import javafx.scene.layout.Priority;

/**
 * Created by wangwentao on 2016/5/23.
 */
public class PriorityTest extends Thread{
    public PriorityTest(){}

    public PriorityTest(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<50;i++) {
            System.out.println(getName() + ", 其优先级是：" + getPriority() + ",循环变量的值是：" + i);
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for (int i = 0; i < 30; i++) {
            if (i == 10) {
                PriorityTest low = new PriorityTest("低级");
                low.start();
                System.out.println("设置之前的优先级" + low.getPriority());
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if (i == 20) {
                PriorityTest high = new PriorityTest("高级");
                high.start();
                System.out.println("设置之前的优先级" + high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
