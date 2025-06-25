package TwoDimensionArray;

import java.util.Scanner;

public class basicDeclerationInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
//        arr [0] [0]= 10;
//        arr [0] [1]= 20;
//        arr [0] [2]= 30;
//        arr [1] [0]= 30;
//        arr [1] [1]= 30;
//        arr [1] [2]= 30;
//        arr [2] [0]= 30;
//        arr [2] [1]= 30;
//        arr [2] [2]= 30;
        int m = arr.length;
        int n = arr[0].length;
//        Input of 2D Array
        for (int i=0; i<m; i++){  // rows
            for (int j=0; j<n; j++){  // columns
                arr [i][j] = sc.nextInt();
            }
        }

//        Output of 2D Array
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        System.out.println();
        System.out.println(arr[0][1]);

    }
}
