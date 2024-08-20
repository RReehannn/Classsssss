package MainQuestion;// Find the largest/smallest number in the array.


class maxAndMin {
    public static void main(String[] args) {

        int[] a = {10,5,8,66,7,666};


        int max = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max){
                max = a[i];
            }

        }
        System.out.println("Maximum element is " + max);

        minArray();


    }

    public static void minArray(){
        int[] b = {100,55,8,66,7,666};

        int min = b[0];

        for (int i = 1; i < b.length; i++) {

            if (min> b[i])
            {
                min = b[i];
            }


        }
        System.out.println("Minimum Element is "+min);
    }


}
