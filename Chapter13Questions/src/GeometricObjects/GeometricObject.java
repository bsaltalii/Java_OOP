package GeometricObjects;
import java.util.Date;

public abstract class GeometricObject implements Comparable{
    private String color ="White";
    private boolean filled;
    private Date dateCreated;
    protected GeometricObject(){}
    protected GeometricObject(String color,boolean filled){
        dateCreated = new Date();
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        if (this.filled)
            return true;
        return false;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    @Override
    public String toString(){
        return "Date created : "+dateCreated+" \nColor : "+ color+" \nis Filled : "+filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public GeometricObject max(GeometricObject object1,GeometricObject object2){
        if (object1.getArea()>object2.getArea())
            return object1;
        return object2;
    }
}
