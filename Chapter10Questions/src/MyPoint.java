public class MyPoint {
    private double x;
    private double y;
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(MyPoint myPoint){
       return Math.sqrt(Math.pow((this.x- myPoint.x),2)+Math.pow((this.y-myPoint.y),2));
    }
    public double distance(double x,double y){
        return Math.sqrt(Math.pow((this.x- x),2)+Math.pow((this.y-y),2));
    }
    public static double distance(MyPoint myPoint1,MyPoint myPoint2){
        return Math.sqrt(Math.pow((myPoint1.x- myPoint2.x),2)+Math.pow((myPoint1.y- myPoint2.y),2));
    }

    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 =new MyPoint(10,30.5);
        System.out.println("Distance between two MyPoint Type : " +distance(myPoint1,myPoint2));
    }
}
