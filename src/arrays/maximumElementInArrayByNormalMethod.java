package arrays;

public class maximumElementInArrayByNormalMethod {
    public static void main(String[] args) {
        int [ ]arr = {55,85,65,89,65,12,95,78,99};
        int n = arr.length;
//        int max= arr[0];    taking minimum as first element
        int max =-1;   //taking maximum as -1 : agar -1 se choti sari element hai to work nahi karega
        for (int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
