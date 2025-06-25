package basics;

import java.util.Scanner;

public class sumOfTwoNumbersThroughUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no:");
            int a=sc.nextInt();
        System.out.println("Enter the second no:");
            int b=sc.nextInt();
        System.out.println(a+b);
    }
}
