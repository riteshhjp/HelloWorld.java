package arrays;

public class maximumElementInArrayByMinimumValue {
    public static void main(String[] args) {
        int []arr= {78,65,78,95,98,102,350};
        int max=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max= arr[i];
            max =Math.max(max, arr[i]);
            }
//        for second maximum
        int secondmax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > secondmax && arr[i] != max){
                if(arr[i]!=max)
                    secondmax = Math.max(secondmax, arr[i]);

            }
        }
        System.out.println(max);
        System.out.println(secondmax);
    }
}
