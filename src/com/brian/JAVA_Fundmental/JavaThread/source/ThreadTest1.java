package com.brian.JAVA_Fundmental.JavaThread.source;


class MThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread mThread = new MyThread();
        Thread t1 = new Thread(mThread);
        t1.setName("thread_1");
        t1.start();
        Thread t2 = new Thread(mThread);
        t2.setName("thread_2");
        t2.start();
    }
}
