package crazyJavaAccount;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangwentao on 2016/5/24.
 */
public class AccountWithLock {
    private final ReentrantLock lock = new ReentrantLock();
    private String accountNo;
    private double balance;

    public AccountWithLock(){}

    public AccountWithLock(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void draw(double drawAmount){
        lock.lock();
        try{
            if (balance >= drawAmount) {
                System.out.println(Thread.currentThread().getName()+"取钱成功"+"吐出钞票："+ drawAmount);
                try{
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= drawAmount;
                System.out.println("余额是："+balance);
            }else{
                System.out.println(Thread.currentThread().getName()+"取钱失败， 余额不足！");
            }
        }finally{
            lock.unlock();
        }
    }


}
