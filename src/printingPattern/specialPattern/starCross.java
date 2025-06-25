package printingPattern.specialPattern;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= Sc.nextInt();

        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(i==j||i+j==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
