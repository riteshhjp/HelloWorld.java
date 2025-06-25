package conditionals;

import java.util.Scanner;

public class tirangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Side of the triangle:");
        int a= sc.nextInt();
        System.out.println("Enter the Second Side of the triangle:");
        int b= sc.nextInt();System.out.println("Enter the third Side of the triangle:");
        int c= sc.nextInt();
        if ((a+b>c)&&(b+c>a)&&(c+a>b))
            System.out.println("This is a Valid Triangle");
        else
            System.out.println("This is not a valid triangle");
    }
}
