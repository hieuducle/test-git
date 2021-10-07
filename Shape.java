public abstract class Shape {
    protected String color;
    protected boolean fillled;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.fillled = fillled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return fillled;
    }

    public void setFilled(boolean filled) {
        this.fillled = fillled;
    }

    public double getArea() {

    }

    public double getPerimeter() {

    }

    public String toString() {

    }
}
