package com.brian.JAVA_Fundmental.JavaThread.excercise;

/**
 * create three window
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        t3.start();
    }
}


class Window1 implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while(true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + ": selling tickets, tickers numbers" + tickets);
                tickets--;
            } else break;
        }
    }
}
