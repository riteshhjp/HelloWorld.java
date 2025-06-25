package String;

public class interningKeyWord {
    public static void main(String[] args) {
        String s = "Raghav";
        String q = "Raghav"; //  new string create nahi hua hai ek
        // hi string ko point kar rahi hai
//        Raghav = -> madhav
        String t = new String("Raghav");
        s =  "Ritesh";
        System.out.println(s);

    }
}
