package conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=Sc.nextInt();
        if(n<0)
            System.out.println(-n);
        else
            System.out.println(n);

    }
}
