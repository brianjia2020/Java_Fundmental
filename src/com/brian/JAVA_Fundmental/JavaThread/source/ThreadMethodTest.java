package com.brian.JAVA_Fundmental.JavaThread.source;

/**
 * to test the thread class method
 * 1. start() : start the current thread and invoke the run() method
 * 2. run(): to override the thread class method.
 * 3. currentThread(): return the current Thread object
 * 4. getName(): get the name of the Thread name
 * 5. setName(): set the name of the Thread name
 * 6. yield(): release the cpu off this thread
 * 7. join(): call B's join method inside A thread, A enters blocked mode
 *            and starts to process B thread.
 * 8. stop(): stop the thread execution
 * 9. sleep(): the thread will be stopped for certain time
 * 10. isAlive(): check if current thread is still running
 * 11. priority: 0 - 10, getPriority() and setPriority()
 *
 */
public class ThreadMethodTest {
    public static void main(String[] args)  {
        HelloThread h1 = new HelloThread("Brian' Thread");
        //h1.setName("Brian's Thread");
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();
        Thread.currentThread().setName("Main Thread");
        for (int i = 0; i < 100; i++) {
            if(i%2 ==0){
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority()+ " "+i);
            }

            if (i == 20) {
                try {
                    h1.join();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}

class HelloThread extends Thread {
    public HelloThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 ==0){
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority()+" "+i);
            }

            if(i%20 ==0) {
//                Thread.yield();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}