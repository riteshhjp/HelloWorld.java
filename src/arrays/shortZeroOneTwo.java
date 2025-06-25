package arrays;

public class shortZeroOneTwo {
    public static void main(String[] args) {
        int []arr={0,1,0,1,2,2,0,1};
                int n = arr.length;
//                Method 1

//        int zero=0; int one=0;
//        for (int i=0; i<n; i++){
//            if (arr[i]==0) zero++;
//            if (arr[i]==1) one++;
//        }
//        for (int i = 0; i<n; i++){
//            if (i<zero) arr[i]=0;
//            else if (i<one) arr[i]=1;
//            else arr[2]=2;
//        }

//        Method No 2 : Dutch Flag Algorithm

        int lo= 0; int mid=0; int hi=n-1;
        while (mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                mid++; lo++;
            }
            else if (arr[mid]==1) mid++;
            else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }

        }
        for(int ele : arr)
        System.out.print(ele);
    }
}
