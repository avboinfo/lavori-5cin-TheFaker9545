public class HelloWorld {
    public static void main(String[] args){
        Thread[] threadArray = new Thread[10];
        for(int i=0; i<10; i++){
            Thread thread = new Thread(new ThreadHello());
            thread.setName(String.valueOf(i+1));
            threadArray[i] = thread;
        }
        for (Thread thread : threadArray) {
            thread.start();
        }
    }
}
