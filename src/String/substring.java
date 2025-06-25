package String;

public class substring {
    public static void main(String[] args) {
        String s = "abcdefgh";

//         Strring builder(i)
        System.out.println(s.substring(3));
        // prints 3 and aage wale index
        System.out.println(s.substring(2,6));
        // prints 2 and 6-1 wale index
        System.out.println(s.substring(2,2));
        // kuch bhi print nahi hoga

//        String builder (i,j)
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
