package arrays;
import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int ele : arr){   // for each loop;
            System.out.println(ele + " ");
        }
        System.out.println();
        int [] nums = arr;  // shallow copy
        nums[0]=52;
        int [] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70;
        System.out.println(arr[0]);
        System.out.println(brr[0]);

    }
}
// shalow copy me changes ho jaye ga
//lekin deep copy me change nahi hoga