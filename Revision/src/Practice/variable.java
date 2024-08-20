package Practice;

public class variable {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a); //5

        int x = ++a;

        System.out.println(x); //6 increase the value by 1

        int y = a++;

        System.out.println(y); //6 //increase but not use in current statement

        int d = --a; //4

        System.out.println(d);

        int e = a--;
        System.out.println(e); //4


    }
}
