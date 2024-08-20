package Main;

public class main0 {
    public static void main(String[] args) {
        max();
        min();

    }

    public static void max(){

        int[] a = {120,150,16, 18,63};

        int max = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max){
                max = a[i];

            }


        }
        System.out.println("Maximum number: "+ max);
    }

    public static void min(){

        int[] a = {12,15,16, 18,63};

        int min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i]< min){
                min = a[i];
            }

        }
        System.out.println("Minimum no. is: "+ min);


    }
}
