package itvdn_homeworks.itvdn_threads.hw_4;

public class Main {
    public static void main(String[] args)  throws InterruptedException {
        A a = new A();
        B b = new B();

        Thread t = new Thread(a);
        Thread t1 = new Thread(b);

        for (int i = 0; i <= 10; i++) {
            t.run();
            t1.run();
        }
    }
}

class A  implements Runnable{

    String str = "This is class A";
    @Override
    public void run() {
            try {
                Thread.sleep(200);
                System.out.println(str);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public String getStr () {
        return str;
    }
}

class B implements Runnable {

    String str = "This is class B";

    @Override
    public void run() {
            try {
                Thread.sleep(200);
                System.out.println(str);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public String getStr () {
        return str;
    }
}