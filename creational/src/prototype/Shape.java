package prototype;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    //Copy constructor
    protected Shape(Shape target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    //Clone this object via its copy constructor.
    public abstract Shape copy();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Shape shape)) return false;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }
}