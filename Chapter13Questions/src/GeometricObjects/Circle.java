package GeometricObjects;
public class Circle extends GeometricObject implements Comparable{
    private double radius;
    public Circle(){}
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    @Override
    public boolean equals(Circle circle1,Circle circle2){
        if (circle1.radius==circle2.radius)
            return true;
        return false;
    }
}
