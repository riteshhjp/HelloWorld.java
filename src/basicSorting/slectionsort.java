package basicSorting;

public class slectionsort {
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
        for (int i = 0; i<n-1; i++){
        int min = Integer.MAX_VALUE;
        int mindx = -1;
        for( int j=i; j<n; j++){
            if (arr[j]<min){
                min = arr[j];
                mindx = j;
            }
        }
        swap(arr, i, mindx);
        }
        print (arr);

    }
}
