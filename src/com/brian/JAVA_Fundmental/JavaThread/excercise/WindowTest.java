package com.brian.JAVA_Fundmental.JavaThread.excercise;

/**
 * three window selling tickets
 *
 */
public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        w1.setName("Window One");
        Window w2 = new Window();
        w2.setName("Window Two");
        Window w3 = new Window();
        w3.setName("Window Three");

        // it's not thread safe
        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(getName() + ": ticket no is: " + ticket);
                ticket --;
            } else break;
        }
    }
}
