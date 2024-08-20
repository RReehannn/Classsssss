package Interview;

public class Increment {

    public static void main(String[] args) {

    /*    Pre-Increment(++x)

        int x = 5;
        int y = ++x; //Pre-Increment so, x is increments to 6 before assignment to y

        System.out.println(x); //output: 6
        System.out.println(y); //output: 6

        */

  /*      //Post-Increment(x++)

        int x = 5;
        int y = x++; //post-increment the value of x 5 is assign to y.
                     // x is incremented to 6 after the assignment to y.

        System.out.println(x); //output: 6
        System.out.println(y); //output: 5

        */

//        //Pre-Decrement(--x)
//
//        int x = 5;
//        int y = --x; //pre-decrement, x is decrements to 4 before assignment to y
//
//        System.out.println(x); //Output: 4
//        System.out.println(y); //output: 4

        //Post-Decrement(x--)

       /* int x = 5;
        int y = x--; //post-Decrement the value of x 5 is assign to y.
        // and then x is decremented to 4 after the assignment to y.

        System.out.println(x); //output: 4
        System.out.println(y); //Output: 5*/


        /*


        Pre-increment (++x) increments the value of x before using it in the expression.
        Post-increment (x++) increments the value of x after using it in the expression.

        *
        *
        * */

/*        int a = 5;
        int b = a++;
        int c = ++a;

        System.out.println(a); //output: 7
        System.out.println(b); //5
        System.out.println(c); //7*/

        int a = 5;
        int b = 10;
        int result = ++a + b-- + a-- + ++b + b--;

        System.out.println("a: " + a); //5
        System.out.println("b: " + b); //9
        System.out.println("result: " + result); //42


        int x = 8;
        int y = --x + x++ + ++x + x--;

        System.out.println("x: " + x); //8
        System.out.println("y: " + y); //32











    }
}
