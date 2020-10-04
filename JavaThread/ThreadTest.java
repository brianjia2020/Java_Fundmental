public class ThreadTest {
    public static void main(String[] args) {
        //3. create a  MyThread class instance
        MyThread t1 = new MyThread();
        //4. start
        t1.start();
        for (int i = 0; i < 100; i++) {
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i+"*****");
            }
        }
    }
}

//1. a class extending the Thread class
class MyThread extends Thread {
    //2. re-write the run method
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
