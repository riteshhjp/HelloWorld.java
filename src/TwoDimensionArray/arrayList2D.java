package TwoDimensionArray;
import java.util.ArrayList;

public class arrayList2D {
    public static void main(String[] args) {
        int [][] a = {{1,2,3}, {3,4,6}, {6,7,2}};
        int [][] b = {{1,2,3,8}, {3,9,4,5}, {6,7,0,8}};
        if (a[0].length !=b.length){
            System.out.println("Multiplication  Not Possible");
        }
        else{  //Multiplication is Possible
            int [][] c= new int [a.length][b[0].length];
            for (int i = 0; i<c.length; i++){
                for (int j = 0; j<c[0].length; j++ ){
                    for(int k = 0; k<b.length; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
}
