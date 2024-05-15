public class ThreadHello implements Runnable{
    public void run(){
        System.out.println("Thread numero "+ Thread.currentThread().getName() + ": Hello World!");
    }
}
