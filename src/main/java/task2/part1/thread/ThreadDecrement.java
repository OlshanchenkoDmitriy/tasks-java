package task2.part1.thread;

import task2.part1.entity.Bank;

public class ThreadDecrement implements Runnable {

    private Bank bank;

    public ThreadDecrement(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.dec();
    }
}
