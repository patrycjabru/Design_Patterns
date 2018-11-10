public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle source) {
        super(source);
        if (source==null)
            return;
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "W: "+width+", H: "+height+"\n";
    }

}
