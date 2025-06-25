package conditionals;

import java.util.Scanner;

public class greatestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no");
        int a=sc.nextInt();
        System.out.println("Enter the Second no");
        int b=sc.nextInt();
        System.out.println("Enter the third no");
        int c=sc.nextInt();
        if(a>=b&&a>=c)
            System.out.println("First no is the gratest" + a);
        else if(b>=a&&b>=c)
            System.out.println("Second  no is the gratest"+ b);
        else
            System.out.println("Third no is the gratest" + c);


    }
}
