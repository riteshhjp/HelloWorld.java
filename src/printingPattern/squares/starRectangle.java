package printingPattern.squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows amd Columns:");
        int m= sc.nextInt();
        int n= sc.nextInt();
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
