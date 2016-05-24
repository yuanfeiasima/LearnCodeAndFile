package crazyJavaAccount;

/**
 * Created by wangwentao on 2016/5/23.
 */
public class TestDraw {
    public static void main(String[] args) {
        Account acct = new Account("1234567", 1000);
        new DrawThread("甲", acct, 800).start();
        new DrawThread("乙", acct, 800).start();
        System.out.println("stop");
    }
}
