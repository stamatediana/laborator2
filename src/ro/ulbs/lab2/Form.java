package ro.ulbs.lab2;

public class Form {
    private String color;

    public Form() {
        this.color = "white";
    }

    public Form(String color) {
        this.color = color;
    }

    public float getArea() {
        return 0;
    }
    @Override
    public String toString() {
        return "This form has the color " + color;
    }
}