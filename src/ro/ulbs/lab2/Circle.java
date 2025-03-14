package ro.ulbs.lab2;

public class Circle extends Form {
    private float radius;

    public Circle() {
        super();
        this.radius = 0;
    }


    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }


    @Override
    public String toString() {
        return "This circle has the color " + getColor() + " and radius " + radius;
    }
}
