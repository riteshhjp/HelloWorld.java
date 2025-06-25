package conditionals;

public class checkTypeOfTriangle {
    public static void checktriangle(int a, int b, int c){
        if (a==b && b==c ){
            System.out.println("This is a equailateral triangle.");
        }
        else if (a==b || b==c || c==a){
           System.out.println("This is Isocles Triangle.");
        }
        else {
            System.out.println("This is a scalen Triangle.");
        }
    }
    public static void main(String[] args) {
        checktriangle(4,5,3);
        checktriangle(5,9,10);

    }
}
