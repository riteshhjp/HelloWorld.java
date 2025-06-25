package TwoDimensionArray;

public class rowWiseAndColumnWiseprintingOrTranspose {
    public static void main(String[] args) {
        int [][] arr ={ {1,2},{3,4},{5,6}};
        int m = arr.length; int n = arr[0].length;
//        row wise printing
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        column wise printing
        for (int j = 0; j<n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int [][] brr = new int [n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                brr [i][j] = arr[j][i];
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
