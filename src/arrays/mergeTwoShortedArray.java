package arrays;

public class mergeTwoShortedArray {
    public static void main(String[] args) {
        int [] a = {10,12,14,18};
        int [] b = {9,11,15,19,25,35};
        int [] c= new int [a.length+b.length];
        int i=0; int j=0; int k=0;

//        Merging
while(i<a.length && j<b.length){
    if (a[i]<b[j]){
        c[k]= a[i];
        i++;
    }
    else {
        c[k] = b[j];
        j++;

    }
    k++;
}
if (i==a.length){ // now take element from a only
    while(j<b.length){
        c[k]= b[j];
        j++; k++;
    }

}
        if (j==b.length){ // now take element from a only
            while(i<a.length){
                c[k]= a[i];
                i++; k++;
            }

        }
for (int ele : c){
    System.out.print(ele + " ");
}

    }
}
