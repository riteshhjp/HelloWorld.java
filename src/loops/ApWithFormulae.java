package loops;

import java.util.Scanner;

public class ApWithFormulae {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
//        1 3 5 7 9 ..............
        for(int i=1; i<=2*n-1; i+=2)
            System.out.println(i);
    }
}
