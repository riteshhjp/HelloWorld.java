package String;

import java.util.Scanner;

public class intInputToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        String b = "" + a;
        System.out.println(b);
//        System.out.println(b.length()); // length of integer bhi hai

//        inbuilt function  to print integer length

        String c = Integer.toString(a);
        System.out.println(c.length());
    }
}
