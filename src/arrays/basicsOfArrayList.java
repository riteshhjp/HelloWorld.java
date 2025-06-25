package arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
//        int arr ={1,2,3};
        ArrayList<Integer> arr = new ArrayList<>(3);
//        to add element in array
        arr.add(0,10);
        arr.add(1, 20);
        arr.add(2,30);
        System.out.println(arr);
        System.out.println(arr.get(0));
        for (int i = 0; i<arr.size(); i++ ){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
//        TO modify element in Arry
        arr.set(0,20);

                System.out.println(arr);
                arr.add(40); //array ke last me element add karta hai
        System.out.println(arr);
        arr.remove(3);   // array ke eleent ko remove karne ke liyae
        System.out.println(arr);




    }
}
