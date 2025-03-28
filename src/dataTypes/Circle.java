package dataTypes;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "dataTypes.Circle {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
