package loops;
import java.util.Scanner;

public class toCheckPalindrome {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            boolean isPalindrome = true;

            int length = input.length();
            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }

            sc.close();
        }
    }


