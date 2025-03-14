package ro.ulbs.lab2;

public class Triangle extends Form {
    private float height;
    private float base;


    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }


    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }


    @Override
    public float getArea() {
        return 0.5f * base * height;
    }


    @Override
    public String toString() {
        return "This triangle has the color " + getColor() + ", height " + height + " and base " + base;
    }

    public boolean equals(Triangle other) {
        return this.height == other.height && this.base == other.base && this.getColor().equals(other.getColor());
    }
}
