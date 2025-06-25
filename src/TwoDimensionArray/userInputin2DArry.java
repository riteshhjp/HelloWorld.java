package TwoDimensionArray;

import java.util.Scanner;

public class userInputin2DArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int m = sc.nextInt();
        System.out.println("Enter the column:");
        int n = sc.nextInt();




        int [][] arr =  new int [m][n];


        System.out.println("Insert the values in the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        boolean flag = true;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                if (arr[i][j]==target) {
                    System.out.print("element found");
                    flag = false;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.print("element not found");
        }

    }
}
