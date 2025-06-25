package loops;

import java.util.Scanner;

public class gcdOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first No:");
        int a = sc.nextInt();
        System.out.println("Enter the Second No:");
        int b = sc.nextInt();
        int n = Math.min(a,b);
        int gcd = 1;
        for (int i=1; i<=n; i++){
            if (a % i ==0 && b % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        sc.close();
    }
}
