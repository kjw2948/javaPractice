package access.ex1.ex;

import access.ex1.ex.MaxCounter;

public class CounterMain {
    public static void main(String[] args) {
        access.ex1.ex.MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
