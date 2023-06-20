package GeometricObjects;

public class Triangle extends GeometricObject{
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(){}
    public Triangle(double sideOne,double sideTwo,double sideThree,String color,boolean filled){
        super(color, filled);
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;
    }
    public double getSideOne(){
        return sideOne;
    }
    public void setSideOne(double side){
        this.sideOne=side;
    }
    public double getSideTwo(){
        return sideTwo;
    }
    public void setSideTwo(double side){
        this.sideTwo=side;
    }
    public double getSideThree(){
        return sideThree;
    }
    public void setSideThree(double side){
        this.sideThree=side;
    }
    @Override
    double getArea() {
        double s = (this.sideOne + this.sideTwo + this.sideThree) / 2;
        return Math.sqrt(s * (s - this.sideOne) * (s - this.sideTwo) * (s - this.sideThree));
    }
    @Override
    double getPerimeter() {
        return (this.sideOne+this.sideTwo+this.sideThree);
    }
}
