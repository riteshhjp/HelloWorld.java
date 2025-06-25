package loops;

import java.util.Scanner;

public class primeAndCompositeNo {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n= Sc.nextInt();
        int x = 0;
//        0 means prime
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
//                'i' is the factor of 'n'
                System.out.println("Composite No");
                x=1;
//                1 means composite
                break;
            }
        }
        if(x==0) System.out.println("prime No");
    }
}
