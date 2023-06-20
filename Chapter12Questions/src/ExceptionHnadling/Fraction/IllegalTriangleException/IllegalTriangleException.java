package ExceptionHnadling.Fraction.IllegalTriangleException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message){
        super(message);
    }

    public static void main(String[] args) {
        try {
            Triangle tri = new Triangle(3,4,1);
        }catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }
}
