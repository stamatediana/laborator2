public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }
    @Override
    public float getArea() {
        return (base * height) / 2;
    }
@Override
    public String toString() {
    return super.toString() + ", height: " + height + ", base: " + base;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        Triangle other = (Triangle) obj;


        return Float.compare(this.height, other.height) == 0 &&
                Float.compare(this.base, other.base) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(height);
        result = 31 * result + Float.floatToIntBits(base);
        return result;
    }
}

