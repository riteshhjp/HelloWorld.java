package loops;

import java.util.Scanner;

public class sumOfnNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No:");
        int n = sc.nextInt();
//        int count= 0;

////        Method : 1 Using for loop
//        for (int i=0; i<=n; i++){
//            count += i;
//
//        }
//        System.out.println(count);
//
//        Method : 2 Using if else

               int sum= (n*(n+1))/2;

        System.out.println(sum);
    }
}
