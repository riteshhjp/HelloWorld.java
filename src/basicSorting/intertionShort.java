package basicSorting;

public class intertionShort {
    public static void swap (int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int [] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,8,-9,2,-4,6};
        int n = arr.length;
        for (int i=1; i<n; i++){ // n-1 Passes
            for (int j=i; j>=1; j--){
                if (arr[j] < arr[j-1])
                    swap(arr, j, j-1);
                    else break;

            }

        }
        print(arr);
    }
}
