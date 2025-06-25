package printingPattern.specialPattern;

import java.util.Scanner;

public class floyadTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No:");
        int n= sc.nextInt();
        int a= 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

    }
}
