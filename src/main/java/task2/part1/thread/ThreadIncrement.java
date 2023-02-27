package task2.part1.thread;

import task2.part1.entity.Bank;

public class ThreadIncrement implements Runnable{

    private Bank bank;

    public ThreadIncrement(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.inc();
    }
}
