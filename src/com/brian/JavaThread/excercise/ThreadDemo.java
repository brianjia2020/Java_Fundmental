package excercise;

public class ThreadDemo {
    public static void main(String[] args) {
        myThread1 m1 = new myThread1();
        myThread2 m2 = new myThread2();
        m1.start();
        m2.start();

//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i%2 == 0) {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }.start();

    }
}

class myThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
