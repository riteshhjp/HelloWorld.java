package TwoDimensionArray;

public class transformIntoTranspose {
    public static void print (int [][] arr){
        int m = arr.length; int n = arr[0].length;
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        This is only possible in a square matrix
        int [][]  arr ={ {1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length; int n = arr[0].length;
        for (int i = 0; i<m; i++){
            for (int j = 0; j<i; j++){   // triangle wala looo lagayege
                int temp = arr [i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
print (arr);

    }
}
