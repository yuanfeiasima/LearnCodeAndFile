package crazyJavaAccount;

/**
 * Created by wangwentao on 2016/5/24.
 */
public class TestDrawWaitNotify {

    public static void main(String[] args) {
        AccountWaitNotify accountWaitNotify = new AccountWaitNotify("12345678", 0);
        new DrawThread("取钱者",accountWaitNotify, 800).start();
        new DepositAmount("存钱者1", accountWaitNotify, 800).start();
        new DepositAmount("存钱者2", accountWaitNotify, 800).start();
        new DepositAmount("存钱者3", accountWaitNotify, 800).start();
        
    }

    public static class DrawThread extends Thread{
        private AccountWaitNotify account;
        private double drawAmount;

        public DrawThread(String name, AccountWaitNotify account, double drawAmount) {
            super(name);
            this.account = account;
            this.drawAmount = drawAmount;
        }

        public void run() {
            for (int i = 0; i < 100; i++) {
                account.draw(drawAmount);
            }
        }
    }

    public static class DepositAmount extends Thread{
        private AccountWaitNotify account;
        private double depositAmount;

        public DepositAmount(String name, AccountWaitNotify account, double depositAmount) {
            super(name);
            this.account = account;
            this.depositAmount = depositAmount;
        }

        public void run(){
            for (int i = 0; i < 100; i++) {
                account.deposit(depositAmount);
            }
        }
    }
}
