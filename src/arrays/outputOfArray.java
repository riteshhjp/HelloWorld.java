package arrays;

import java.util.Scanner;

public class outputOfArray {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Array:");
        int[] arr= new int[5];
//        input loop
         for (int i=0; i<=4; i++){
             arr[i] = Sc.nextInt();
         }
//        output loop

        for (int i=0; i<=4; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
