package basics;

import java.util.Scanner;

public class areaOfCircleThroughUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle:");
        double r=sc.nextDouble();
        double a =3.14*r*r;
        System.out.println(a);

    }
}
