package basics;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int n = sc.nextInt();

////        Method No 1: simple

        if ((n % 4 == 0 && n % 100!= 0 ) || n % 400== 0){
            System.out.println("The given No is a Leap Year;");
        }
        else {
            System.out.println("The Gven number is not a leap Year");
        }

//        Method NO 2: nested

        if (n % 100 == 0){
            if (n % 400 == 0){
                System.out.println("The given No is a leap Year");
            }
            else {
                System.out.println("The given No is not a leap Year");
                }
        }else {
                if (n % 4 == 0){

                    System.out.println("The given No is a leap Year");
            }
                else {
                    System.out.println("The given No is a not leap Year");
                }
            }
        }
    }

