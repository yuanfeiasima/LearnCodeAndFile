package crazyJavaThraed;

import java.util.Date;

/**
 * Created by wangwentao on 2016/5/23.
 */
public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++) {
            System.out.println("当前时间："+ new Date());
            Thread.sleep(1000);
        }
    }
}
