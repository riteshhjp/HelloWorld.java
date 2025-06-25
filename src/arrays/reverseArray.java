package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 23, 25, 9, 15};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
////        reverse normal method
//        for (int i = 0; i < n / 2; i++) {
//            int j = n - 1 - i;
//            int temp = arr[i];
//            arr[i] = arr[n - 1 - i];
//            arr[n - 1 - i] = temp;
//        }
//        reverse two pointer technique
        int i = 0;
        int j= n-1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        for (int ele : arr) {
            System.out.print(ele + " ");

        }
    }
}