package itvdn_homeworks.itvdn_threads.hw_2;

public class Main  {
    public static void main(String[] args) {
        Thread thread = new Thread();

        for (int i = 0; i <=3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
                System.out.println("Main = " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Main thread - the end of execution");


        new Thread().start();
        new First().start();
        new Second().start();

    }


}
class First extends Thread{
    @Override
    public void run () {
        for (int i = 0; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(200);
                System.out.println("First =  " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("First thread - the end of execution");

    }


}
class Second extends Thread{
    @Override
    public void run () {
        for (int i = 0; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(300);
                System.out.println("Second = " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Second thread - the end of execution");

    }

}
