package conditionals;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        if(n%5==0)
            System.out.println("Yes the Number is Divisible by Five.");
            else
                System.out.println("No the Number is not Divisible By Five.");
    }
}
