package GeometricObjects;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color, filled);
        this.height=height;
        this.width=width;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    @Override
    double getArea() {
        return this.height*this.width;
    }
    @Override
    double getPerimeter() {
        return 2*(this.height+this.width);
    }
}
