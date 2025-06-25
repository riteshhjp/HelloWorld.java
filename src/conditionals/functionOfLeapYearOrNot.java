package conditionals;

import java.util.Scanner;

public class functionOfLeapYearOrNot {
    public static void check (int n){
        Scanner sc = new Scanner(System.in);
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 ==0 ){
            System.out.println("This is a Leap Year:");
        }
        else {
            System.out.println("This is not a leap Year:");
        }
    }
    public static void main(String[] args) {
        check(5000);
    }
}
