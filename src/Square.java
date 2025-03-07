public class Square extends Form {
    private float side;


    public Square() {
        super();
        this.side = 0;
    }

    public Square(String color, float side) {
        super(color);
        this.side = side;
    }
    @Override
    public float getArea() {
        return side * side;
    }
    @Override
    public String toString() {
        return super.toString() + ", side: " + side;
    }
}
