public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(Circle source) {
        super(source);
        if (source == null)
            return;
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "R: "+radius+"\n";
    }
}
