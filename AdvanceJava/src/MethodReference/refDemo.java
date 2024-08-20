package MethodReference;

public class refDemo {

    public static void main(String[] args) {

        System.out.println("Learning method reference....");


        //provide the implementation of workInter


        //static method ko refer kiya hai
        //className::method Name
        WorkInter workInter = Stuff::doStuff;


        workInter.doTask();

        Runnable runnable = Stuff::threadTask;

        Thread d = new Thread(runnable);
        d.start();


    }
}
