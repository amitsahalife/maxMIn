public class Array_MAX_MIN_FIND_ARRAY {
    public static void main(String[] args) {
        int a [] = {4,5,3,2,1,6};
        // FIND THE MAXIMUM VALUE IN ARRAY
        int max = a[0];
        int min = a [0];
        for (int i =1;i<a.length;i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i]<min)
            {
                min = a[i];
            }
        }
        // for maximum
            System.out.println("Max  "+ max);
        // for minimum
        System.out.println("Min "+ min);
    }
}
