public class Circle2D {
    private double x;
    private double y;
    private double radius;
    public Circle2D(){
        this.x=0;
        this.y=0;
        this.radius=1;
    }
    public Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double getArea(){
        return (Math.PI*Math.pow(this.radius,2));
    }
    public double getPerimeter(){
        return (Math.PI*2*this.radius);
    }
    public boolean contains(double x,double y){
        double distance = Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
        if (distance<this.radius)
            return true;
        else
            return false;
    }
    public boolean contains(Circle2D circle2D){
        double distance = Math.sqrt(Math.pow((circle2D.x-this.x),2)+Math.pow((circle2D.y-this.y),2));
        if (distance<Math.abs(circle2D.radius-this.radius))
            return true;
        else
            return false;
    }
    public boolean overlaps(Circle2D circle2D){
        double distance = Math.sqrt(Math.pow((circle2D.x-this.x),2)+Math.pow((circle2D.y-this.y),2));
        if (distance>Math.abs(circle2D.radius-this.radius)&&distance<(this.radius+circle2D.radius))
            return true;
        else
            return false;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle2D c1 =new Circle2D(2,2,5.5);
        System.out.println("Area : "+c1.getArea());
        System.out.println("Perimeter : "+c1.getPerimeter());
        System.out.println(c1.contains(3,3));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
