package Practice;

class SecondHighestLowest {
    public static void main(String[] args) {
        int[] a = {10, 200, 22, 55, 30};

        // Finding second highest
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        // This ensures any number in the array will be larger than these initial values

        for (int i = 0; i < a.length; i++) {
            if (a[i] > highest) {
                secondHighest = highest;
                highest = a[i];
            } else if (a[i] > secondHighest && a[i] != highest) {
                secondHighest = a[i];
            }
        }
        System.out.println("Second Highest: " + secondHighest);

        // Finding second lowest
        secondLowest(a);
    }

    public static void secondLowest(int[] a) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }
        System.out.println("Second Smallest: " + secondSmallest);
    }
}


// First Condition: Updates the highest and second highest numbers when a new highest number is found.
//Second Condition: Updates the second highest number when a new second highest number is found,
// which is smaller than the highest but greater than the current second highest.

