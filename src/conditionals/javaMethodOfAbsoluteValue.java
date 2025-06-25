package conditionals;

public class javaMethodOfAbsoluteValue {
    public static void absolute(int number){
        if (number<0){
            number = -number;
            System.out.println(number);
        }
        else{
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        absolute(50);
        absolute(-25);

    }
}
