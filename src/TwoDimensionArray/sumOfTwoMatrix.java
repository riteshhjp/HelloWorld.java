package TwoDimensionArray;

public class sumOfTwoMatrix {
    public static void main(String[] args) {
        int [][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [] []b = {{7,8,9}, {4,5,6}, {1,2,3}};
        int m = a.length;
        int n =  b[0].length;
        int [][] c = new int[m][n];
        for ( int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                c [i][j] = a[i][j] + b [i][j];
            }
        }
        for ( int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
               System.out.print(c [i][j] + " ");
            }
            System.out.println();
        }


    }
}
