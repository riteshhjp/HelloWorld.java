package basicSorting;

import java.util.Arrays;
public class checkIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,7,5,9,4,6,8,5};
        int n = arr.length;
        // Built in function for shorting.

        Arrays.sort(arr);

        boolean flag = true; // true means sorted.
        for (int i = 0; i<n-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false; // flag-> unsorted
                break;
            }
        }
        if (flag==true)
            System.out.println("Sorted Array");
        else
            System.out.println("UnSorted Array");
    }

}
