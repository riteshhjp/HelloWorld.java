package conditionals;

import java.util.Scanner;

public class greatestOfThreeNoWithoutLogicalAnd {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first no");
            int a=sc.nextInt();
            System.out.println("Enter the Second no");
            int b=sc.nextInt();
            System.out.println("Enter the third no");
            int c=sc.nextInt();

            if(a>b)
                if(a>c)
                    System.out.println("First No is gratest." + a);
                else
                    System.out.println("Third No is gratest" + c);
            else
                if(b>c)
                System.out.println("Second No is gratest" + b);
                else
                    System.out.println("Third No is gratest" + c);
    }
}
