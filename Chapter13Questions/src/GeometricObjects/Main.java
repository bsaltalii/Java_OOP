package GeometricObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle(3,"Blue",true);
        System.out.println(circle.getArea());
        Triangle tri = new Triangle(3,4,5,"Red",true);
        System.out.println(tri.getArea());
        System.out.println((circle.max(circle,tri)).getArea());
    }
}

