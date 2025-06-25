package arrays;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,5,4,9,3};
        int x = 9;
        int n= arr.length;
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++)
                if (arr[i]+arr[j]==x){
                    System.out.println(arr[i]+ " " +arr[j]);
                    System.out.println(i + " " + j);

                    break;

                }
        }
    }
}
