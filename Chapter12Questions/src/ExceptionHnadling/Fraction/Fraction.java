package ExceptionHnadling.Fraction;
public class Fraction {
    int numerator;
    int denumarator;
    public Fraction(int numerator,int denumarator) throws NullDenominatorException{
        if (denumarator==0)
            throw new NullDenominatorException("denumarator cannot be zero.");
        this.numerator=numerator;
        this.denumarator=denumarator;
    }
}
