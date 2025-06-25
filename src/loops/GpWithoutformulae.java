package loops;

import java.util.Scanner;

public class GpWithoutformulae {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the No");
        int n=Sc.nextInt();
//       4 6 8 10 .......
        int a = 4, r=2;
        for(int i=1; i<=n; i++) {
            System.out.println(a);
            a *= r;
    }
}
}
