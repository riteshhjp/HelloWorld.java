package conditionals;

import java.util.Scanner;

public class calculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first No:");
        int a=sc.nextInt();
        System.out.println("Enter the character:");
        char operator=sc.next().charAt(0);
        System.out.println("Enter the second NO:");
        int b=sc.nextInt();
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
