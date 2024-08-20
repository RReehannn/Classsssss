package Main;

public class main2 {
    public static void main(String[] args) {
        secondHighest();
        secondLowest();

    }

    public static void secondHighest(){

        int[] a = {10,5,33,56,45};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > highest){
                secondHighest = highest;
                highest = a[i];
            } else if (a[i] > secondHighest && a[i] != highest) {
                secondHighest = a[i];

            }

        }
        System.out.println(secondHighest);
    }

    public static void secondLowest(){

        int[] b = {55,44,66,88,3,96};

        int lowest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < b.length; i++) {

            if (b[i] < secondSmallest){
                secondSmallest = lowest;
                lowest = b[i];
            } else if (b[i] < secondSmallest && b[i] !=lowest) {
                secondSmallest = b[i];

            }

        }
        System.out.println(secondSmallest);

    }

}
