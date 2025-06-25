package String;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int n = str.length();
        int count = 0;

        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (isVowel (ch) == true) count++;
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A' ) return true;
        if(ch=='b' || ch=='B' ) return true;
        if(ch=='c' || ch=='C' ) return true;
        if(ch=='d' || ch=='D' ) return true;
        if(ch=='e' || ch=='E' ) return true;
        return false;


    }
}
