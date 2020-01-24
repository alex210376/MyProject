package academy.lesson05;

import java.util.Objects;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        super("black");
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double area() {
        return Math.PI * radius * radius;
    }

    public void draw(){
        System.out.println("Это круг");
        System.out.println(String.format("Circle with radius=%.2f, color=%s", radius, color));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}

