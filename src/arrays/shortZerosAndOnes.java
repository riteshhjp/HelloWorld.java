package arrays;

public class shortZerosAndOnes {
    public static void main(String[] args) {
        int []arr= {0,1,0,1,0,1,0,1};
        int n= arr.length;
//        method 1
//        int noOfZeros=0;
//        int noOfOnes;
//        for(int i=0; i<n; i++) {
//            if (arr[i] == 0)
//                noOfZeros++;
//        }
//            for(int i=0; i<noOfZeros; i++){
//                if(i<noOfZeros)arr[i]=0;
//                else arr[i]=1;
//            }

//        method 2: One Pass Solution
        int i =0; int j= n-1;
        while(i<j){
            if (arr[i]==0)i++;
            if (arr[j]==1)j--;
            if (i>j) break;
            if (arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j++;
            }
        }
            for(int ele : arr)
            System.out.print(ele);

        }

}
