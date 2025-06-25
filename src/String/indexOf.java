package String;

public class indexOf {
    public static void main(String[] args) {
        String str = "My name is Ritesh kumar";
        System.out.println(str.indexOf('i'));// age se first index deta hai
        System.out.println(str.indexOf('R'));
        System.out.println(str.lastIndexOf('i')); // piche se first index deta hai

        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b));

        // iss case me character ki ascaii value ka diffrence dete hai
        // first value ko compare karta hai
        // agar  first samme hai to next value ko compare karta
        // last tak compare karte huar same hai to kitna
        // character jayda hai wo deta hai

        String s = "I am reading books";
        System.out.println(s.contains("re")); // charecter nahi daal sakte.
        System.out.println(s.startsWith("I am"));
        System.out.println(s.endsWith("ing"));


    }
}
