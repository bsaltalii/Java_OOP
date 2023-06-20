package GeometricObjects;

public class ComparableCircle extends Circle implements Comparable{
    @Override
    public GeometricObject max(GeometricObject object1, GeometricObject object2){
        if (object1.getArea()>object2.getArea()){
            return object1;
        }
        return object2;
    }
}
