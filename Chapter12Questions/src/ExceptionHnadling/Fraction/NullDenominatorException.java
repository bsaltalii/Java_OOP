package ExceptionHnadling.Fraction;

public class NullDenominatorException extends Exception{
    public NullDenominatorException(String message){
        super(message);
    }
}
