package task2.part1;

import task2.part1.entity.Bank;
import task2.part1.thread.ThreadDecrement;
import task2.part1.thread.ThreadIncrement;

public class Main {

    public static void main(String[] args) {
        final Bank bank = new Bank();

        ThreadIncrement threadIncrement = new ThreadIncrement(bank);
        ThreadDecrement threadDecrement = new ThreadDecrement(bank);

        threadIncrement.run();
        threadDecrement.run();
    }
}
