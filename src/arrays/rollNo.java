package arrays;

public class rollNo {
    public static void main(String[] args) {
        int [ ] arr= {89,78,92,49,65,50,69,72};
        int n = arr.length;
        for(int i=0; i<=n; i++){
            if(arr[i]<80)
            System.out.println(i);
        }
    }
}
