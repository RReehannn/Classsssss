package Lambda.LambdaThread;

public class ThreadDemo {
    public static void main(String[] args) {

        //First Thread: Thread Rehan
        // Runnable is Functional Interface

        Runnable thread1 = () -> {
            //This is the body of Thread
            //stuff

            for (int i = 1; i <=10 ; i++) {
                System.out.println("Value of i " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
        //We have to create Thread class
        Thread t = new Thread(thread1);
        t.setName("Demon");
        t.start();




    }
}
