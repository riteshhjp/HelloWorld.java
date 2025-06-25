package printingPattern.specialPattern;

import java.util.Scanner;

public class oddnoTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No:");
        int n= sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(2*j-1 + " ");
//
//            }
//            System.out.println();
//        }

//        iss se kisi bhi ap ko print kar sakte hai

        for (int i=1; i<=n; i++){
            for (int j=1; j<=2*i-1; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }
}
