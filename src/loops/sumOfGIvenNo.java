package loops;

import java.util.Scanner;

public class sumOfGIvenNo {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the No:");
    int n = sc.nextInt();
    int sum = 0;
    while(n!=0) {
        int lastdigit=n%10;
        sum+=lastdigit;
        n /= 10;

    }
    System.out.println(sum);

}
}

