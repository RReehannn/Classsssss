package Practice;

import java.util.Arrays;

public class maxAndMin {

    public static void main(String[] args) {

        int[] a = {10, 20, 30,40, 50};

        int max = a[0];
        int min = a[0];

        for (int i = 1 ; i < a.length; i++){

            if (a[i] > max){
                max = a[i];
            } else if (a[i] < min) {

                min = a[i];

            }

        }
        System.out.println(max);
        System.out.println(min);
        maxAndMin();
    }

    public static void maxAndMin(){
        int[] nums = {55, 14, 5,6,88,6,3,8};

        Arrays.sort(nums);
        System.out.println(nums);
        int max = nums[nums.length-1];
        int min = nums[0];

        System.out.println(max);
        System.out.println(min);



    }
}
