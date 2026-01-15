package prototype;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        setColor(color);
        this.width = width;
        this.height = height;
    }

    private Rectangle(Rectangle target) {
        super(target);
        this.width = target.width;
        this.height = target.height;
    }

    @Override
    public Shape copy() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle shape) || !super.equals(object)) return false;
        return shape.width == width && shape.height == height;
    }
}
