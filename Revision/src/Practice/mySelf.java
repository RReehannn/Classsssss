package Practice;

public class mySelf {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};



        reverseArray(array);

        System.out.print("Reverse Array: ");
        for (int reverse: array){
            System.out.print(reverse + " ");
        }


    }

    public static void reverseArray(int[] array){

        int start = 0;
        int end = array.length - 1;

        while (start < end){

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
