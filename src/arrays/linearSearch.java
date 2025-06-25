package arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int x=sc.nextInt();
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the array element:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag= false; // flase meanse not found
        for(int i=0; i<n; i++){
            if (arr[i]==x)
                flag= true; // true means found
            break;
        }
        if (flag==true)
            System.out.println("Element found");
        else System.out.println("Element not found");




    }
}
