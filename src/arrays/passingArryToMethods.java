package arrays;

public class passingArryToMethods {
    public static void main(String[] args) {
int []arr = {12,45,32,11,42};
System.out.println(arr[0]);
change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int []arr ){
        arr[0]=10;

    }
}
