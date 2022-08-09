package itvdn_homeworks.itvdn_threads.hw_7;

/**
 * @author Nazarii Soviak
 */

public class Main {

    public static void main(String[] args) {
        MyThreadOne t1 = new MyThreadOne();
        MyThreadTwo t2 = new MyThreadTwo();

        t1.setThread2(t1);
        t2.seThread1(t2);

        t1.start();
        t2.start();
    }

}

class MyThreadOne extends Thread {
    private Thread t1;

    MyThreadOne () {
        System.out.println("My Thread one create");
    }

    public void setThread2 (Thread t) {
        this.t1 = t;
    }

    @Override
    public void run () {
        System.out.println("My Thread one start");
        try {
            sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("My Thread 1 finished");
    }

}

class MyThreadTwo extends Thread {
    private Thread t2;

    MyThreadTwo () {
        System.out.println("My Thread two create");
    }

    public void seThread1 (Thread t) {
        this.t2 = t;
    }

    @Override
    public void run () {
        System.out.println("My Thread 2 start");
        for (int i = 0; i < 5; i++) {
            try {
                sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("My thread 2 finish");
    }
}
