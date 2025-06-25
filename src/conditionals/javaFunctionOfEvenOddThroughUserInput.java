package conditionals;

public class javaFunctionOfEvenOddThroughUserInput {
    public static void evenodd (int number){
        if (number % 2 == 0){
            System.out.println(" The given no is Even:");
        }
        else{
            System.out.print(" The given no is Odd:");
        }
        }

    public static void main(String[] args) {
        evenodd(10);
        evenodd(11);
    }
}
