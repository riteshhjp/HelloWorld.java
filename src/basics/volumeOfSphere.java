package basics;

import java.util.*;

public class volumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r=sc.nextInt();

       double  volume=1.33*3.14*(r*r*r);

        System.out.println(volume);

    }
}
