public abstract class Shape {
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(Shape source) {
        if (source==null)
            return;
        this.color = source.color;
    }

    public abstract Shape clone();
    public abstract String toString();
}
