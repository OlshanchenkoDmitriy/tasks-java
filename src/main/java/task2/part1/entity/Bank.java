package task2.part1.entity;

public class Bank {

    private Integer account;

    public Bank() {
        account = 0;
    }

    public synchronized void inc() {
        for (; account < 20000; account += 2) {
            System.out.println("inc: " + account);
        }
    }

    public synchronized void dec() {
        for (; account > 1; account--) {
            System.out.println("inc: " + account);
        }
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getAccount() {
        return account;
    }
}
