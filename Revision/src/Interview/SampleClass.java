package Interview;

public class SampleClass {
    public static void main(String[] args) {

        int[] i = {1,2,3,4,8};
        int ind = i.length -1;

        for (int k = 0; k < i.length/2; k++) {

            i[k] = i[ind] + i[k];
            i[ind] = i[k] -i[ind];
            i[k] = i[k] -i[ind];
            ind--;

        }
        for (int t: i) {
            System.out.print(t + " ");

        }
    }
}
