package loops;

import java.util.Scanner;

public class multiplicationOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Table of the given Number is:");
        int table = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(i*table);

        }

    }
}
