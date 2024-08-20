package Lambda.LambdaExpression;

public class Main {
    public static void main(String[] args) {

        System.out.println("Implement Functional Interface using class\n");


        MyInter myInter = new MyInterImpl();
        myInter.sayHello();

        System.out.println("\n Using Anonymous Class\n");

        MyInter i = new MyInterImpl(){
            @Override
            public void sayHello() {
                System.out.println("This is first anonymous class");
            }
        };
        i.sayHello();

        /* MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is second anonymous class");
            }
        };
        i2.sayHello(); */

        // Using our interface with the help of lambda
        System.out.println("\nUsing Lambda Expression Third Way\n");

        MyInter i1 = ()-> System.out.println("\nI am using lambda Expression");


        i1.sayHello();

        MyInter i2 = () -> System.out.println("This is second time i am using Lambda");
        i2.sayHello();


    }
}







