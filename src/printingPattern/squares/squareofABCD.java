package printingPattern.squares;

import java.util.Scanner;

public class squareofABCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No:");
        int n= sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(j+64) + " ");

            }
            System.out.println();
        }

    }
}
