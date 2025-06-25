package TwoDimensionArray;

public class maxIn2Darray {
    public static void main(String[] args) {

    int [][]arr = {{12,23,15,},{22,23,24},{24,25,63}};
    int mx = Integer.MIN_VALUE;
    int m = arr.length;
    int n= arr[0].length;
    int sum = 0;
    for (int i = 0; i<m; i++){
        for( int j=0; j<n; j++){
            mx = Math.max(mx, arr[i][j]);
            sum+=arr[i][j];
        }
    }
    System.out.println(mx);
        System.out.println(sum);


}

}
