package String;

public class lowerAndUpperCase {
    public static void main(String[] args) {
        String str = "My name is Ritesh Kumar. I am 24 Year old.";
        System.out.println(str.toLowerCase()); // sirf ek banta hai
//        str.toLowerCase();  use less

        String a = str.toLowerCase(); // permanent ban gaya hai
        System.out.println(str);
        System.out.println(a);
        System.out.println(str.toUpperCase());

//        to concate

        String str1 = "rit";
        String str2= "esh";
        System.out.println(str1.concat(str2));

        String str3 = str1.concat(str2);
        System.out.println(str3);

    }
}
