package task2.part2.thread;

import task2.part1.entity.Bank;

public class ThreadDecrement implements Runnable {

    private Bank bank;

    public ThreadDecrement(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        synchronized (bank){
            for (int i = 0; i <= 200000; i++){
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("Thread inc: " + bank.getAccount());
        }
    }
}