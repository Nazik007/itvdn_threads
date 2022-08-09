package itvdn_homeworks.itvdn_threads.hw_3;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new PriorityThread());
        t.setName("Min");
        t.setPriority(5);
        Thread t1 = new Thread(new PriorityThread());
        t1.setName("Max");
        t1.setPriority(10);
        Thread t2 = new Thread(new PriorityRunner());
        t2.setPriority(7);
        t2.setName("Norm");
        System.out.println(Thread.currentThread().getName());
        t.start();


        t1.start();
        t2.start();
    }
}

class PriorityRunner implements Runnable  {

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            try {
                Thread.sleep(100);
                System.out.println( ("i = " + i + " " +Thread.currentThread().getName()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PriorityThread extends Thread {
    public void run() {
        for (int j = 0; j <= 50; j++) {
            try {
                Thread.sleep(100);
                System.out.println("j = " + j + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
