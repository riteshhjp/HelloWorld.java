package conditionals;

import java.util.Scanner;

public class logicalAndandOr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= Sc.nextInt();
        if(n>99&&n<10000)
            System.out.println("It is a three digit no");
        else
            System.out.println("This is not a three digit no");

        if(n%3==0||n%5==0)
            System.out.println("Divisible by three or five");
        else
            System.out.println("Not Divisible by three or five");

    }
}
