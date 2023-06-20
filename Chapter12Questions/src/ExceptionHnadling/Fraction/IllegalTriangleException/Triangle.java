package ExceptionHnadling.Fraction.IllegalTriangleException;
public class Triangle {
    double sideOne;
    double sideTwo;
    double sideThree;
    public Triangle(double sideOne,double sideTwo,double sideThree) throws IllegalTriangleException{
        if (sideOne+sideTwo>sideThree||sideOne+sideThree>sideTwo||sideTwo+sideThree>sideOne)
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side.");

        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;
    }
}
