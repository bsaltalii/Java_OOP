package GeometricObjects;

public class Square extends GeometricObject implements Colorable{
    private double side;
    public Square(){
        this.side=0;
    }
    public Square(double side){
        this.side=side;
    }

    public void setSide(double side){
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    double getArea() {
        return (this.side*this.side);
    }

    @Override
    double getPerimeter() {
        return (4*this.side);
    }
}
