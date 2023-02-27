package task2.part2.thread;

import task2.part1.entity.Bank;

public class ThreadIncrement implements Runnable {

    private Bank bank;

    public ThreadIncrement(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        synchronized (bank){
            for (int i = 0; i <= 200000; i++){
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("Thread dec: " + bank.getAccount());
        }
    }
}