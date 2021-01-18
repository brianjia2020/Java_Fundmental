package source;

/**
 * to test the thread class method
 * 1. start() : start the current thread and invoke the run() method
 * 2. run(): to override the thread class method.
 * 3. currentThread(): return the current Thread object
 * 4. getName(): get the name of the Thread name
 * 5. setName(): set the name of the Thread name
 * 6. yield():
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");
        for (int i = 0; i < 100; i++) {
            if(i%2 ==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

        HelloThread h1 = new HelloThread("Brian' Thread");
        //h1.setName("Brian's Thread");
        h1.start();

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
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i%20 ==0) {
                Thread.yield();
            }
        }
    }
}