package String;

public class plusOperator {
    public static void main(String[] args) {
        String s = "Rit";
        String s1 = "esh";
        String s3 = "is";
        String s4 = " 24 ";
        System.out.println(s + s1 + " " + s3 + s4);

        String a = "abc";
        String b = "def";
        a +=b;
        System.out.println(a);
        a = 10 + b;
        System.out.println(a);
// based on the heirachy of operator.
        System.out.println("abc"  + 10 + 20);
        System.out.println(10 + 20 + "abc");


    }
}
