package basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Character:");
        char ch= sc.next().charAt(0);
        int x=(int)ch;
        System.out.println(x);
//        System.out.println((int)ch);
    }
}
