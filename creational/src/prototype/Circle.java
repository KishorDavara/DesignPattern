package prototype;

public class Circle extends Shape {
    private final int radius;

    public Circle(int x, int y, String color, int radius) {
        setX(x);
        setY(y);
        setColor(color);
        this.radius = radius;
    }

    private Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle shape) || !super.equals(object)) return false;
        return shape.radius == radius;
    }
}