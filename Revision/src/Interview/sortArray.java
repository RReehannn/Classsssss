package Interview;

//Sorting A array without using the Arrays.sprt()

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,2,4,6,8,0};

        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i] > arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }



        }
        System.out.println(Arrays.toString(arr));
    }
}
