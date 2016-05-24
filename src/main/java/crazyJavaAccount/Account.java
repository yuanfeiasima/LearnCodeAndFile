package crazyJavaAccount;

/**
 * Created by wangwentao on 2016/5/23.
 */
public class Account {
    private String accountNo;
    private double balance;
    public Account(){}
    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo(){
        return accountNo;
    }

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int hashCode(){
        return accountNo.hashCode();
    }

    public boolean equals(Object object) {
        if (object != null && object.getClass() == Account.class) {
            Account target = (Account) object;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
    public synchronized void draw(double drawAmount){
        if (balance >= drawAmount) {
                System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= drawAmount;
                System.out.println("\t余额为：" + balance);
            } else {
                System.out.println(Thread.currentThread().getName()+"取钱失败！余额不足");
            }
    }

}

