package conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Selling Price:");
        int sp=sc.nextInt();
        System.out.println("Enter the Cost  Price:");
        int cp=sc.nextInt();
        if(sp>cp)
            System.out.println("Profit");
        else if (cp>sp)
            System.out.println("Loss");
            else
                System.out.println("No Profit No Loss");

    }
}
