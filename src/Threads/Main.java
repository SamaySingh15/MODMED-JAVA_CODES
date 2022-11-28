package Threads;
public class Main {
    public static void main(String[] args){
        System.out.println("hello from the main thread");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        AnotherThread anotherThread2 = new AnotherThread();
        anotherThread2.start();
        System.out.println("hello again from the main thread");

    }
}
